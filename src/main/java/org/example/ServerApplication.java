package org.example;

import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import netinet.in.in_addr;
import netinet.in.sockaddr_in;

import java.math.BigInteger;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static netinet.sctp.sctp_h.listen;
import static org.example.SocketUtil.*;

public class ServerApplication {

    private static final Logger LOGGER = Logger.getLogger(ServerApplication.class.getSimpleName());

    public static void main(String[] args) throws Exception {
        System.load("/usr/lib/x86_64-linux-gnu/libsctp.so");
        short localPort = 5000;
        List<InetAddress> addresses = List.of(
                InetAddress.getByName("127.0.0.1"),
                InetAddress.getByName("127.0.0.2"),
                InetAddress.getByName("127.0.0.3")
        );
        try (ResourceScope scope = ResourceScope.newSharedScope()) {
            int socket = createSocket(addresses, localPort, scope);
            int listenResult = listen(socket, 1);
            if (listenResult < 0) {
                throw new IllegalStateException("Listening given socket failed.");
            }
            AcceptInfo acceptInfo = acceptClient(scope, socket);
            if (acceptInfo.clientSocket() == -1) {
                throw new IllegalStateException("Client could not connect");
            }
            List<InetAddress> clients = acceptInfo.clientAddresses();
            LOGGER.info(() -> "Connected %s client(s) in port: %d".formatted(clients, acceptInfo.getPort()));
            CompletableFuture<Void> future = listenSocket(acceptInfo.clientSocket(), scope);
            future.get();
            LOGGER.info("System closed!");
        }
    }

    private static CompletableFuture<Void> listenSocket(int clientSocket, ResourceScope scope) {
        return CompletableFuture.runAsync(() -> {
            try {
                MemorySegment buffer = MemorySegment.allocateNative(1024, scope);
                do {
                    ReceiveInfo receive = receiveMessage(scope, buffer, clientSocket);
                    if (receive.receivedBytes() < 0) {
                        LOGGER.info("Client disconnected!");
                        break;
                    }
                    int address = Integer.reverseBytes(in_addr.s_addr$get(sockaddr_in.sin_addr$slice(receive.fromAddress())));
                    InetAddress inetAddress = InetAddress.getByAddress(BigInteger.valueOf(address).toByteArray());
                    String fromAddressString = inetAddress.getHostAddress();
                    String receivedMessage = buffer.getUtf8String(0).replace("\n", "");
                    LOGGER.info(() -> "From %s message is '%s'".formatted(fromAddressString, receivedMessage));
                    TimeUnit.SECONDS.sleep(1);
                    sendMessage(scope, clientSocket, receivedMessage);
                    LOGGER.info("Message sent!");
                } while (true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, Executors.newSingleThreadExecutor());
    }
}
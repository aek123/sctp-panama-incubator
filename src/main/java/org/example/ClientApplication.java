package org.example;

import jdk.incubator.foreign.ResourceScope;

import java.net.InetAddress;
import java.util.List;

import static org.example.SocketUtil.connectClient;
import static org.example.SocketUtil.createSocket;

public class ClientApplication {

    public static void main(String[] args) throws Exception {
        System.load("/usr/lib/x86_64-linux-gnu/libsctp.so");
        short localPort = 5001;
        short serverPort = 5000;
        List<InetAddress> localAddresses = List.of(
                InetAddress.getByName("127.0.0.4")
//                InetAddress.getByName("127.0.0.5"),
//                InetAddress.getByName("127.0.0.6")
        );
        List<InetAddress> serverAddresses = List.of(
                InetAddress.getByName("127.0.0.1"),
                InetAddress.getByName("127.0.0.2"),
                InetAddress.getByName("127.0.0.3")
        );
        try (ResourceScope scope = ResourceScope.newSharedScope()) {
            int socket = createSocket(scope, localAddresses, localPort);
            connectClient(scope, socket, serverAddresses, serverPort);
        }
    }
}

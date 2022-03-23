lksctp-tools required for some sctp functionalities.

Eiter java 19-panama+1-13 or java 18(ea-35 or later) required.

In order to run following VM options required: 

    --add-modules jdk.incubator.foreign
    --enable-native-access ALL-UNNAMED

java 19-panama+1-13 jextract used for generated files from header files.

In order to test following command works fine:

    sctp_darn -P 5464 -H 127.0.0.5 -B 127.0.0.4 -c 127.0.0.1 -c 127.0.0.2 -c 127.0.0.3 -p 5000 -s 


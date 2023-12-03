package edu.hw8.Task1.Server;

import java.io.IOException;

public final class ServerDriver {

    private ServerDriver() {

    }

    public static void launch() throws IOException, InterruptedException {
        Server server = new Server();
        server.start();
    }

}

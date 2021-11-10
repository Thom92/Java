import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Messenger {

    private static boolean running = false;

    public static void startAcceptingConnections(int poolSize) throws IOException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(poolSize);

        Messenger.running = true;

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (Messenger.stillRunning()) {
            if (executor.getPoolSize() >= poolSize) {
                continue;
            }

            Socket socket = serverSocket.accept();
            executor.submit(new ClientConnection(socket));
        }
    }

    public static void stop() {
        Messenger.running = false;
    }

    public static boolean stillRunning() {
        return Messenger.running;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChatServer {
   static boolean running = true;
    public static void main(String[] args)
    {
        ArrayList listOfClients = new ArrayList();
        try {
            Messenger.startAcceptingConnections(5);

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            while (ChatServer.isAlive()) {
                String command = input.readLine();

                ChatServer.handleCommand(command);
            }

            ChatServer.cleanUp();
        } catch (IOException e) {
            System.out.println("Not connected");
            e.printStackTrace();
        }
    }

    private static boolean isAlive()
    {

    }

    private static void cleanUp()
    {

    }

    public static String handleCommand(String command)
    {
        if(command.equals("Quit"))
        {
            running = false;
        }
        else if(command.equals("List"))
        {

        }

    }
}
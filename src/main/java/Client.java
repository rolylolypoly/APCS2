import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by rolypoly on 11/23/15.
 */
public class Client implements Runnable{
    static {
        String hostName = "localhost";
        int port = 56789;
        try (
                Socket socket = new Socket(hostName, port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()))
        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        (new Thread(new UserInput())).start();
        (new Thread(new ServerResponse())).start();

    }

    private class UserInput implements Runnable {

        @Override
        public void run() {

        }
    }
    private class ServerResponse implements Runnable {

        @Override
        public void run() {

        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by rolypoly on 11/23/15.
 */
public class Client implements Runnable {
    private static Socket socket;

    public static void init() throws IOException {
        int port = 56789;
        String hostName = "localhost";
        socket = new Socket(hostName, port);
    }

    @Override
    public void run() {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
        (new Thread(new UserInput())).start();
        (new Thread(new ServerResponse())).start();
    }

    private class UserInput implements Runnable {
        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()))
            ) {
                while (in.readLine() != null)
                    System.out.println(in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ServerResponse implements Runnable {
        @Override
        public void run() {
            try (
                    PrintWriter out = new PrintWriter(socket.getOutputStream())
            ) {
                BufferedReader stdIn =
                        new BufferedReader(new InputStreamReader(System.in));
                while (stdIn.readLine() != null)
                    out.println(stdIn.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

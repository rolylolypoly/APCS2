import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;

/**
 * Created by rolypoly on 11/23/15.
 */
public class Client implements Runnable {
    protected static Socket socket;
    protected String serverResponse;
    protected String clientInput;
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

    private class ServerResponse implements Runnable {
        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()))
            ) {
                socket.notify();
                while (in.ready() && (serverResponse = in.readLine()) != null && (!Objects.equals(serverResponse, "asf;lasdkf;asdkf"))) {
                    System.out.println("Server: " + in.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class UserInput implements Runnable {
        @Override
        public void run() {
            try (
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
            ) {
                BufferedReader stdIn =
                        new BufferedReader(new InputStreamReader(System.in));
                out.println("Client Hello.");
                while ((clientInput = stdIn.readLine()) != null)
                    out.println(clientInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

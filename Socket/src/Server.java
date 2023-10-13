import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);

            while (true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

                Message clientMessage = (Message) input.readObject();
                char maxChar = clientMessage.getMaxChar();
                int maxCount = clientMessage.getMaxCount();

                output.writeObject("Max Character: " + maxChar + " (Count: " + maxCount + ")");
                output.flush();
                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

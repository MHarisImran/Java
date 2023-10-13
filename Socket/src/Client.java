import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            String inputString = "Hello, this is a test string with some characters.";
            Message message = new Message(inputString);

            output.writeObject(message);
            output.flush();

            String serverResponse = (String) input.readObject();
            System.out.println("Server Response: " + serverResponse);

            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

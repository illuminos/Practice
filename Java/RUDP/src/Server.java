import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {

    public static void main(String[] args) throws IOException {

      DatagramSocket serverSocket = new DatagramSocket(12345);
      byte[] buffer = new byte[1024];
      DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
      System.out.println("Waiting for connections !");
      serverSocket.receive(packet);
      System.out.println(new String(packet.getData(),"UTF-8"));
    }
}

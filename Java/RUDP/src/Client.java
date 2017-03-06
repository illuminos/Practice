import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * File  : Client Author: Ujwal Bharat Nagumantri Desc  :
 */
public class Client {
  public static void main(String[] args) throws IOException {
    DatagramSocket socket = new DatagramSocket();
    byte[] buffer = "Hey there".getBytes();
    InetAddress address = InetAddress.getByName("localhost");
    DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address,12345);
    socket.send(packet);
    System.out.println("Message successfully sent !");
  }
}

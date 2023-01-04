import java.nio.channels.NetworkChannel;
import java.util.Scanner;
public class takinginputfromuser {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int p = s.nextInt();
      int r = s.nextInt();
      int t = s.nextInt();

      System.out.println((p*r*t)/100);
    }
}

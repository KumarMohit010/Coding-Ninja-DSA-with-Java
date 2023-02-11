import java.util.Scanner;

/**
 * ifelse
 */
public class ifelse {

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (m % 2 == 0) {
            System.out.println( "number Is even");
        } else {
            System.out.println( "number is odd");
        }
    }
}

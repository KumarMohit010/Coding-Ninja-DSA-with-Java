import java.util.Scanner;

public class LArgestofthre {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a >= b && a >= c) {
            System.out.println("a is greatest");
        } else if (b >= a && b >= c) {
            System.out.println("B is greatest");

        } else {
            System.out.println("C is greatest");
        }
    }

}
// in if close your bracket then start the else 
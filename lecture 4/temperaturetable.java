import java.util.Scanner;

public class temperaturetable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        int f;
        while (S <= E) {
            f = ((5 * (S - 32)) / 9);
            System.out.println(S + " " + f);
            S = S + W;

        }

    }
}
// here S is the starting temperature E is ending temperature and W is difference
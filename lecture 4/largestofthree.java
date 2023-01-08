import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a>=b && a>=c){
            System.out.println(a + " a is greatest");
        } else {
        if (b>=a && b>=c){
            System.out.println(b + "b is greatest");
        } 
        else {
            System.out.println(c + " C is greatest");
        } }

    }
}
// you can't add else without the if bracket and if you use 2 if brackets then it will run two times so use  nested if-else-if ladder
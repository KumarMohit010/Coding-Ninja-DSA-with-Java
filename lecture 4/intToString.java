import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a == 0){
            System.out.println("ZERO ");

        }else if (b==1){
            System.out.println("ONE");

        }else if (c==3){
            System.out.println(" Three ");
        }else 
        {
            System.out.println("The number is not 0 1 and 2");
        }
    }

    
    
}

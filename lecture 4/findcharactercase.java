import java.util.Scanner;

/**
 * findcharactercase
 */
public class findcharactercase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m= s.nextLine().charAt(0);
                if(m>=65 && m<=90){
                    System.out.println("The character given is in upper case");
                }else if (m>=97 && m<=122 )
                {
System.out.println("The given Character is in lower case");
                }else{
                    System.out.println("This  isn't an Alphabet");
                }
    }
}

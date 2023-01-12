import java.util.Scanner;
    public class evenaddition {
    
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
    
            int i=2, sum=0;
            
            while(i <= n) {
                sum += i;
                i = i+2;
            }
    
            System.out.println(sum);
        }
    }
    



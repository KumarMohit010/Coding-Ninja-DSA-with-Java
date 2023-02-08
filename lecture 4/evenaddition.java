import java.util.Scanner;
    public class evenaddition {
    
        public static void main(String[] args) {
            int m;
            Scanner sc = new Scanner(System.in);
            m=sc.nextInt();
    
            int i=2, sum=0;
            
            while(i <= m) {
                sum +=  i;
                i = i+2;
            }
    
            System.out.println(sum);
        }
    }
    



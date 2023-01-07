import javax.xml.validation.Validator;

public class Data{
    public static void main(String[] args) {
        char c ='a';
        // System.out.println(c+3);
        //here it will print hundred because it is printing the value of a in ascii
        int i = c + 10;
        System.out.println(i);
        //you can copy int to long but you can't copy bigger data type into smaller ones
        //as you can copy integer in double but you can't copy double into integer
        // long l= i; Valid
        // i=l not vali 
        // double d=i; valid 
        // i=d; not valid
float f =1.23f; //you have to declare 1.23 as f float so that it wont be stores as double because by default every floating point number is stored as double in memory
// d=f; valid;
// f=d not valid;
for copying long data into smaller one we use explicit typecasting as i = (int)l;


    }
}
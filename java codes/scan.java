import java.util.Scanner;

public class scan{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
         double d = scan.nextDouble();
         scan.nextLine();//Understand this
         /*When you use scan.nextInt() or scan.nextDouble(), the scanner reads
          the number but leaves the newline character (Enter key) in the input buffer.
           Then, when you use scan.nextLine(), it consumes the remaining newline character
            and moves the scanner to the next line, allowing you to read the string input
             correctly.If you don't include the additional scan.nextLine() after reading
              the numeric values, the subsequent scan.nextLine() that reads the string
               will consume the leftover newline character, resulting in an empty string 
               being assigned to s. */


        String s = scan.nextLine();
        scan.close();
       

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

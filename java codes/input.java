import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    public static void main(String[] args) throws Exception {//dont do it while developing applications
        
        System.out.println("enter a number");

     //   InputStreamReader in = new InputStreamReader(System.in);
      //  BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);



      //  int num = Integer.parseInt(bf.readLine());

        int num = sc.nextInt();

        System.out.println(num);

       // bf.close();
    }


    
}

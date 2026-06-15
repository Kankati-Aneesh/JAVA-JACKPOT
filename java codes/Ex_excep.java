import java.applet.*;
import java.awt.*;

public class Ex_excep extends Applet
{
    public static void main(String s[])
    {
        try
        {
            int x, y, z;
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
            z = x / y;
            System.out.println(z);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter at valid index");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Not a number");
        }
        catch (ArithmeticException e)
        {
            System.out.println("divided by zero");
        }
        finally
        {
            System.out.println("finally block is executed!");
        }
    }
}

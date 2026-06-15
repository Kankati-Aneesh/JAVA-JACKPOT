public class greatest {
    public static void main(String[] args)
    {
        int x = 17;
        int y = 25;
        int z = 8;

        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}

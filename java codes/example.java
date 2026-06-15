class A
{
    int x = 10;
    public void show()
    {

        System.out.println(x);
    }


}

class B extends A
{

    int y = 20;
    public void show()
    {

        super.show();
        System.out.println(y);

    }

    public class example
    {

        public static void main(String[] args) {
            
            B ob = new B();
            ob.show();
        }


    }


}
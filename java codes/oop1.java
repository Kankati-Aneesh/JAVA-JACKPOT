class calculator{
    
    int num = 5;
    public int add(int n1, int n2)
    {
       int r = n1+ n2;
        return r;
    }
    public void add(int n1, int n2, int n3)
    {
        System.out.println(n1+n2+n3);
    }
}

public class oop1 {
    public static void main(String[] args)
    {
        int num1 = 4;
        int num2 = 5;
        int data = 10;
        calculator calc = new calculator();
      int  result = calc.add(num1,num2);
      calc.add(1,2,3);
      System.out.println(result);
      /*StringBuffer sb = new StringBuffer();
      System.out.println(sb);*/
     
    }
}

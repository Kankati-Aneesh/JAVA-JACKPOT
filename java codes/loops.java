public class loops {
    public static void main(String a[])
    {
        int i = 2;
        while(i<=4)
        {
            System.out.println("hi"+i);
            i++;
        }
        System.out.println(i);
        //do-while
        do
        {
            System.out.println("will be done"+ i);
        }while(i<=1);

        //for loops

        for(int j = 3;j<=5;j++)
        {
            System.out.println("hello"+j);
        }

        //building calender of week
        for(int k = 1;k<6;k++)
        {
            System.out.println("DAY"+k);
            for(int m = 1;m<10;m++)
            {
                System.out.println("  "+(m+8)+" - "+(m+9));
            }
        }
    }
}

public class array {
    
public static void main(String[] args)
{
    int num1[] = new int[4];//by default all values are 0.
    int num[] = {1,2,3,4};
    int nums[][] = new int[3][4];

     
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<4;j++)
        {
       nums[i][j] = (int)(Math.random()*100);
        }
     
    }
    
    for(int i = 0;i<3;i++)
    {
        for(int j = 0;j<4;j++)
        {
            System.out.print(nums[i][j]+" ");
        }
        System.out.println();
    }
    num[1] = 6;


    System.out.println(num[2]);
    System.out.println(num1[2]);

    for(int i = 0;i<4;i++)
    {
        System.out.println(num[i]);
    }
}

}

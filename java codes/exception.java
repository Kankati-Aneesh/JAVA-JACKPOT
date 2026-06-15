public class exception {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 1;
        String S = null;

        int nums[] = new int[5];


        try{
            j = 16/i;
            System.out.println(S.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cant divide by zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds!");
        }
        catch(Exception e){

                System.out.println("something went wrong"+ e);


        }

     System.out.println(j);
     System.out.println("boi boi");








    }
}

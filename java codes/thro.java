public class thro {
    public static void main(String[] args) {
            int i = 20;
        int j = 2;

        try{

            j = 18/i;

            if(j==0){
                throw new ArithmeticException("this is ok");
            }
        }

        catch(ArithmeticException e){

            System.out.println("the default value of it is 18"+e);



        }
        System.out.println(j);






    }
}

class Aneeshexception extends Exception {

    public Aneeshexception(String str){
        super(str);
    }

}


public class cusexcep {
    public static void main(String[] args) {
        int i = 20;
         int j = 2;

    try{

        j = 18/i;

        if(j==0){
            throw new Aneeshexception("this is ok");
        }
    }

    catch(Aneeshexception e){

        System.out.println("the default value of it is 18"+e);



    }
    System.out.println(j);






}
}



interface A{
    int age = 44;
    String name = "aneesh";

    void run();
    void config();
}

interface X  {
    void show();
}
interface Y extends X{
    //the declaration of run method is also inherited here
}

class B implements A,Y{//a class can implement multiple interfaces which is not possible in normal classes 
    public void run()
{
    System.out.println("runs in B");

}
    public void config(){
        System.out.println("configs in B");
    }

    public void show(){
        System.out.println("show of X in B");
    }
}



public class interf {
  public static void main(String[] args) {
    
   {
        
        A obj = new B();
        obj.config();
        Y obj1 = new B();
        obj1.show();

        System.out.println(A.age);


    }
}
}

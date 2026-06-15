class A extends Object{
    public A(){
        super();
        System.out.println("in a");}
        public A(int n){
            super();
            System.out.println("in a int");
        }
}
class B extends A{
    public B(){
        super();
        System.out.println("in b");
    }

    public B(int n){
      //  super();
        this();
        System.out.println("in B int");
    
    }
}



public class superthis
 {
    public static void main(String[] args){
        B obj = new B(5);
    }

}

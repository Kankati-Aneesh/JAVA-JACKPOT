

    class A{
        public void show(){

        
        System.out.println("in a class");
        }
    }
    class B extends A{
        public void show(){
            System.out.println("in b class");
        }
    }
    class C extends A{
        public void show(){
            System.out.println("in c class");
        }
    }
public class dmd{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
    
    


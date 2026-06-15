class A{
    int a;
    public void show(int a){
        this.a = a;
        System.out.println(this.a);
    }

         class B{
            public void config(){
                System.out.println("in config..");
            }
        }
}

public class innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(5);
        A.B obj1 = obj.new B();//A.B obj1 = new A.B()(for static class)
        obj1.config();
    }
}

abstract class A{
    public abstract void show();
}

public class aanda {

    public static void main(String[] args) {
        A obj = new A() {//here we are not creating the objct of class A we are creating the object of anonymous class
            public void show(){
                System.out.println("in new show");
            }
        };
            obj.show();
    }
    
}

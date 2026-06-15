class A{
    public void show(){
        System.out.println("in a show");
    }
}


public class inner {
    public static void main(String[] args) {
        A obj = new A()
       {
        public void show(){
            System.out.println("null");
        }
       };
        obj.show();
    }
}

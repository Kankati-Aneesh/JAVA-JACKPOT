class A{
    public void show() throws Exception{

        Class.forName("A");
    }
}

public class throughs {

    static{
        System.out.println("class is loaded");
    }
    public static void main(String[] args) {
                
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}

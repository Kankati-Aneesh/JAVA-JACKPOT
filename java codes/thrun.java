class A implements Runnable{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}


class B implements Runnable{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}


public class thrun {
    public static void main(String[] args) throws InterruptedException  {
        
        Runnable obj = new A();
        Runnable obj1 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        Thread.sleep(5);
        t2.start();


    }
}

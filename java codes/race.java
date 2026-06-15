class runner{

    int count;
    public synchronized void show(){
        count++;
    }
}


public class race {
    public static void main(String[] args) throws InterruptedException {
        
        runner s = new runner();

        Runnable obj = () ->
        {
            for(int i = 0;i<1000;i++){

                    s.show();
            }

        };

        Runnable obj1 = () ->
        {
            for(int i = 0;i<1000;i++){

                    s.show();
            }

        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(s.count);
    }
}

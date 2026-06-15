abstract class car {

    public abstract void drive();
    public abstract void fly();

    public void music(){
        System.out.println("playing music..");
    }
}
abstract class wagonR extends car{
    public void drive(){
        System.out.println("driving..");
    }
}
class upwagonR extends wagonR{
    public void fly(){
        System.out.println("flying");
    }
}
public class abstr{
    public static void main(String[] args) {
        upwagonR obj = new upwagonR();
        obj.fly();
        obj.drive();
        obj.music();
    }
}

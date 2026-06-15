import inheritance.VeryAdvCalc;//or we can write import inheritance.*

public class demo {
    public static void main(String[] args){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 7);
       int r2 =  obj.div(8, 2);
       int r3 = (int)obj.power(4, 2);
       System.out.println(r1 + " "+r2);
    }
}

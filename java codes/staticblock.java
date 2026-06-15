 class mobile{

    String brand;
    int price;
    static String name;

    void show(){
        System.out.println(brand + ":"+price+" : "+name);
    }

    static {
        name = "one piece";
        System.out.println("this is in static block");
    }

    public mobile(){
        brand = "anime";
        price = 660;
        System.out.println("this is in constructor");
    }
}




public class staticblock {
    public static void main(String[] args){

        mobile obj = new mobile();
        obj.show();
        mobile obj1 = new mobile();

        
       //analyse the output
       /*check the order,try without object creations and use forname method */
        
    
    }
}

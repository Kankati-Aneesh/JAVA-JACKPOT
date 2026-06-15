class mobile{
    String brand;
    int price;
  static  String name;//understand this changes its value for every name variable even in different objects

  public void show(){
    System.out.println(brand+ " : "+price+" : "+ name);
  }
  //this is also for #38
  public static void show1(mobile sup){
    System.out.println(sup.brand+":"+sup.price+":"+name);
  }

}

public class staticv {
    public static void main(String[] args){
        mobile obj1 = new mobile();
        obj1.brand = "luffy";
        obj1.price = 500;
        obj1.name = "one piece";/*the warning here is static variable 
        should be called by class name but not object not mandatory but standard way */

         mobile obj2 = new mobile();
        obj2.brand = "yuji";
        obj2.price = 250;
        obj2.name = "jjk";

         mobile obj3 = new mobile();
        obj3.brand = "tanjiro";
        obj3.price = 600;
        mobile.name = "demon slayer";//understand y we not created obj but did it with class name

        obj1.show();
        obj2.show();
        obj3.show();

      obj1.name = "anime";/*even though i changed it for obj1 it spplies 
      to all name bcoz the name is static variable */

        obj1.show();
        obj2.show();
        obj3.show();

      mobile.show1(obj1);//for #38
    }
    
}


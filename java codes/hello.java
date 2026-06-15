 class vehicle{
    String name;
    int door;
    String colour;

    public void print(){
        
        System.out.println("name:" + name + "door: "+ door + "colour:" + colour);
        
    }




}
 class car extends vehicle{
  
     int HP;
     int maxspeed;

     
}

class bus extends vehicle{
    int seats;

}
public class hello {
    public static void main(String[] args){

        vehicle obj = new vehicle();
        obj.name = "BMW";
        obj.door = 4;
        obj.colour = "red";
       
       bus obj1 = new bus();
       obj1.name = "volvo";

    obj.print();

    }
}

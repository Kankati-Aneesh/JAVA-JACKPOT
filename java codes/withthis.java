class human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
public class withthis {
    public static void main(String[] args){
        human obj = new human();
        obj.setAge(5);
        obj.setName("aneesh");

       System.out.println( obj.getAge());//remember this print statement for return type
        obj.getName();
       
}
}

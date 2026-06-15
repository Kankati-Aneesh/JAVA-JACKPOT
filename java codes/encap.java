class human{
    private String name;
    private int age;

    public void insert(String n,int i){
        name = n;
        age = i;
    }
    public void get(){
        System.out.println(name);
        System.out.println(age);
    }

}

public class encap {
    public static void main(String[] args){
        human obj = new human();
        obj.insert("aneesh", 18);
        obj.get();
        
        
    }
    
}

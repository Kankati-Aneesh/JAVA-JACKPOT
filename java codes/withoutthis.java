class human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age,human sup) {
        sup.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class withoutthis {
    public static void main(String[] args){
        human obj = new human();
        obj.setAge(18,obj);

    }
    
}

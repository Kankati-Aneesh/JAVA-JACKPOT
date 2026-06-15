@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
void run(int i);

}

@FunctionalInterface//for next #
interface C
{
    int add(int i,int j);
}



public class lamb {

    public static void main(String[] args) {

        A obj = () ->
        {
            System.out.println("in a show");
        };
       obj.show();

        B obj1 = (i) ->
        {
            System.out.println("in a run"+ i);
        };

        obj1.run(5);

        C obj2 = (i,j) -> 
        {
           return i + j;
        };
         

       System.out.println(obj2.add(5,4)); 

    }
    
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collect {
    public static void main(String[] args) {
        
        List<Integer> c = new ArrayList<Integer>();
        c.add(2);
        c.add(5);
        c.add(7);
        c.add(9);

       // System.out.println(c.index); this wont be there if we use collection instead of list
        System.out.println(c);
        System.out.println(c.indexOf(2));
        System.out.println(c.get(7));

        for(int i : c)
        {
            System.out.println(i);
        }

    }
    
}

import java.util.Hashtable;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> student = new Hashtable<String,Integer>();

        student.put("aneesh", 1);
        student.put("vamsi", 2);
        student.put("kumar", 3);
        student.put("sai", 4);

        System.out.println(student.keySet());

        for(String n : student.keySet()){

            System.out.println(n + ": " + student.get(n));
        }

    }
}

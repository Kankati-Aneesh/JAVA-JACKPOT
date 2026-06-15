class simp
        {
            public
            void playmusic()
            {
                System.out.println("music playing");
            }
            public String getmeapen(int cost)
            {
                if(cost>10)
                  return "pen";
                return"nothing";/*as it is in method eventhough no else 
                is provided it still works as if else statement */
            
            }
        }
public class oop2 {
    public static void main(String[] args)
    {
        simp obj = new simp();
        obj.playmusic();
       String str= obj.getmeapen(2);
       System.out.println(str);
    }
}

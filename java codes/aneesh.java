class poorab{

    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }

   
    
}

class vamsi extends poorab{
    public void add(int n1, int n2){
        System.out.println(n1*n2+1);
    }
}

public class aneesh {

    public static void main(String[] args){
        poorab obj = new vamsi();
        obj.add(2,3);
        
        

    }
}

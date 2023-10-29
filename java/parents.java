class Mom{
    static void x()
    {
    int a=30;
    int b=20;
    {
        
        System.out.println("vamshi is got " +(a+b));
    }
    }
    void y()
  
    {
        
        System.out.println("vamshi is got A");
    }


}
class Dad extends Mom{
      static void x()
    {
    int m=50;
    int n=20;
    {
        
        System.out.println("vamshi is got " +(m+n));
    }
    }
    void y()
  
    {
        
        System.out.println("vamshi is got B");
    }



    
}
public class Parents{
    public static void main(String[] args) {
        Mom obj=new Mom();
	Dad obj1=new Dad();
  obj.x();
  obj.y();
	 obj1.x();
  obj1.y();
    }
}
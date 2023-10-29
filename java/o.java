// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class m{
    static void a()
    {
        String x="vamshi";
        String y="yadav";
        System.out.println("= "+x+y);
    }
    void b()
    {
         System.out.println("hello");
    }
}
class n extends m{
     static void a()
    {
        String v="i";
        String s="bngrm";
        System.out.println("= "+v+s);
    }
    void b()
    {
         System.out.println("popo");
    }
}
public class o{
    public static void main(String args[])
    {
        m obj=new m();
        n obj1=new n();
        obj.a();
        obj.b();
        obj1.a();
        obj1.b();
    }
}
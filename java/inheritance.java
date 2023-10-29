
class family {
		int a=10,b=20,sum;
   void one()
   {
	
		
		sum=a+b;
		
        System.out.println("Hello, World! = "+sum);
    }
}
class dad extends family
{
    void two()
    {
		
		int c=30,d=20,sum2;
		
		sum2=a+b+c+d;
		
		System.out.println("This my name vamshi  = "+sum2);	//dhintlo methods ichhinam kabatti method ni call chesi excute cheyyali//
    }
}
public class inheritance{
public static void main(String args[])
{
    dad obj=new dad();
    obj.one();
    obj.two();
}
}
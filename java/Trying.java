public class Trying{
	public static void main(String args[])
	{
 	try 
	{
	int a,i=20;
	a=i/2;
	System.out.println(a+"this is posible");
	}
	catch(Exception e)
	{
	 System.out.println("exception handled");
	}
	finally
	{	
	 int d, b=10;
	d=b/0;
	System.out.println(d+"this is finally");
	}

	System.out.println("last line");
}
}


	
	
	
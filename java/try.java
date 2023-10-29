public class Trying{
	public static void main(String args[])
	{
 	try 
	{
	int a,i=20;
	a=i/0;
	System.out.println("this is posible");
	}
	catch(Exception e)
	{
	 System.out.println("exception handled");
	}
	finally
	{
	System.out.println("this is finally");
	}

	System.out.println("last line");
}
}


	
	
	
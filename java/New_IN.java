	
class one{
	 int a=20,b=50;						//class lopale printing kuda rayacchhu kani with in curly braces lo ryali//
	void a()
	{
	System.out.println("the sum is"+(a+b));
	}
}
class two extends one{
	 int c=5;
	void b()
	{
	System.out.println("the sum is"+(a+c)); 	 //dhintlo ante inhrtnc lo method anedhi only instance class lone vasthadhi andhukante method ni with object a 
								call cheyyasthadhi kabatti chuskoni chey//

	}
}
public class New_IN{

public static void main(String args[])

{
	two x=new two();
 x.a();
 x.b();
}
}
	

	
	

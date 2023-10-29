	
class one{
	 int a=20,b=50;
	void a()
	{
	System.out.println("the sum is"+(a+b));
	}
}
class two extends one{
	 int c=5;
	void b()
	{
	System.out.println("the sum is"+(a+c));
	}
}
public class New{

public static void main(String args[])

{
	two x=new two();
 x.a();
 x.b();
}
}
	

	
	

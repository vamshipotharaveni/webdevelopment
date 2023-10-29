public class callbyvalue{
	public static void array(int x)
{
		x=10;
	System.out.println("this is my output= "+x);
	}
	public static void main(String args[])
	{
callbyvalue obj= new callbyvalue();
	int a=5;
	array(a);
System.out.println("this is my output= "+a);
}
}
	
	
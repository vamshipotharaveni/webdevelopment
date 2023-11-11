public class stcinstance {
	int a=10;
	static int b=20;
	public void printAdd()
{
	System.out.println(+a);

}
	public static void main(String args[])
		{
		stcinstance V=new stcinstance();
		
		System.out.println("this is my number="+V.a);
		System.out.println("this is my number="+b);
System.out.println("this is my number="+b);
System.out.println("this is my number="+stcinstance.b);
System.out.println("this is my number="+V.b);
	V.printAdd();
}
}
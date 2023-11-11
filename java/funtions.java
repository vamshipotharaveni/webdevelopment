public class funtions{
	static int printAdd(int a, int b)
{	
	System.out.println("my sum="+(a+b));
	return a+b;

}
		 int a=10;
	public static void main(String args[])
	{
		int b=15;
		funtions obj1=new funtions();
		obj1.a = 10;
		System.out.println(obj1.a);
		System.out.println(+b);
		int x= obj1.a;
		int y=b;
		printAdd(x,y);


}
}
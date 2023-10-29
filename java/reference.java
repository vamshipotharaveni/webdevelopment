public class reference{
		int a,b;
	public void one(reference obj1, reference obj2)
	{
		obj1.a=10;
		System.out.println("this is first assigned value = "+(obj1.a+obj1.b));
		}
	
	public static void main(String args[])
	{
		reference obj1 =new reference();
		reference obj2 =new reference();
		obj1.a=5;
		obj1.b=7;
		obj1.one(obj1, obj1);

		System.out.println(+(obj1.a+obj1.b));
		
	}	
	
}
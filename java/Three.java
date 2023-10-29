class Overrdng{
	int c;
	int one(int a, int b)
	{
	c=a+b;
	return c;
	}
}
class Two extends Overrdng{
	int c;
	int one(int a, int b)
	{
	c=a+b;
	return c;
	}
	
}
public class Three{
	public static void main(String args[])
	{
	Overrdng obj1= new Overrdng();
	Two obj= new Two();
	obj.one(10,20);
	obj1.one(30,40);
	System.out.println(+obj.c);
	System.out.println(+obj1.c);

	}
}
	
	

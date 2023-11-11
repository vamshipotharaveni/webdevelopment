class Overrdng{
	void one()
	{
	System.out.println("this is my first line");	
	}
}
class Two extends Overrdng{
	void one()
	{
	System.out.println("this is my  second line");	
	}
}
public class Three{
	public static void main(String args[])
	{
	Two obj= new Two();
	obj.One();
	}
}
	
	

class Prabhas{
	int a=10;
	void x()
	{
	int b=a;
	System.out.println("First nuber is "+b);
	}
}
class Ntr extends Prabhas{
	int c=20;
	void y()
	{
	System.out.println("This is my second number "+(a+c));
	}
}
class Vijay extends Ntr{
	int d=40;
	void z()
	{
	System.out.println("This is my second number "+(c+d));
	}
}
public class Heros {
public static void main(String args[])	
{
Vijay obj= new Vijay();
obj.x();
obj.y();
obj.z();
}
}


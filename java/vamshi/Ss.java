import packs.S;
public class Ss{
	int x=50;
	int y=80;
	void sub()
	{
	System.out.println("this is sub "+(x-y));
	}
	
public static void main(String args[])	
	{
	S obj1=new S();
	Ss obj=new Ss();
	obj.sub();
	obj1.add();
}
}
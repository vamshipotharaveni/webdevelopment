class College{
	String a="vamshi";
	String b="ajay";
	void a()
	{
	System.out.println("my name "+a);	
	System.out.println("my name "+b);
	}
}
class Btech extends College{
	String c="arun";
	void b()
	{
	System.out.println("my name "+c);	
	System.out.println("my name "+a);
}
}
public class Abc{
public static void main(String args[])
{
	Btech obj=new Btech();
	
}
}
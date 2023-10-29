import java.util.Scanner;
class bahubali{
	
	Scanner sc=new Scanner(System.in);

	String a;
		String b;

	void w()
	{

		
		        System.out.println("a and b "); 
	a=sc.nextLine();
 	b=sc.nextLine();

		String c=a+b;
		System.out.println("==>  "+c);
		}
	}
class prabhas extends bahubali{
	void x()
	{
		String d="it is a third";

		String e=a+b+d;
		System.out.println("==>  "+e);
	}
}
class raana extends bahubali{
	void y(){
	String f="it is a f one 3";

		String g=a+b+f;
		System.out.println("==>  "+g);
}
}
public class kattappa {
	public static void main(String args[])
	{
		prabhas obj1=new prabhas();
		raana obj2=new raana();
		obj1.w();
		obj1.x();

		obj2.y();
}
}
		
	
		

		
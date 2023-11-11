import java.util.Scanner;
abstract class Vivo{
	int a,g;
	String b,c,d,e;
	

	abstract void vphone();
	void v1phone()	
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter fisrt value is year and second in name and third is about");
		b=sc.nextLine();
		a=sc.nextInt();
		c=sc.nextLine();
		System.out.println("model:"+a);
		System.out.println("name of Phone:"+b);
		System.out.println("about Phone:"+c);
		System.out.println("*********************************************************************");
	
		
	}
}
class Oppo extends Vivo{
	void vphone(){
	 	g=2013;
		d="oppo f19";
		e="This is a best phone with snap dragen processor";
		System.out.println("model:"+g);
		System.out.println("name of Phone:"+d);
		System.out.println("about Phone:"+e);
		
		v1phone();
		
	}
}
class Abstrct2{
	public static void main(String args[])
	{
	Oppo obj=new Oppo();
	obj.vphone();
}
}
	
	
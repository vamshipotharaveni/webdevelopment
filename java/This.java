public class This{
	String a;
	String b;
	This()
	{
	System.out.println("  Hi Tharun");
	}
	This(String a,String b)
	{
	this();
	this.a=a;
	this.b=b;
	}
public static void main(String args[])
	{
		String x="vamshi";
		String y="yash";
	This obj=new This(x,y);
	System.out.println("--->"+obj.a);
	System.out.println("--->"+obj.b);
}
}
	
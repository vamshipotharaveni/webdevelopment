package vamshi;
class robo{
	String a="ajay";
	String b="raviteja";
	void add()
	{
	System.out.println("First name = "+a);
	System.out.println("Second name = "+b);
}
}
class robo1 extends robo{
	int x=10;
	int y=20;
	void sub()
	{
	System.out.println("First num = "+x);
	System.out.println("First num = "+y);
	}
}
class robo2 extends robo1{
	
	void sub(int p,int q)
	{
	System.out.println("First num = "+(p+q));
	
	}
}
public class robos{

}

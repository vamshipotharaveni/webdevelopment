class College{
	String a="vamshi";
	String b="ajay";
	{
	System.out.println("my name "+a);	
	System.out.println("my name "+b);
	}
}
class Btech extends College{
	String c="arun";
	{
	System.out.println("my name "+c);	//only class a kabatti etla excute aindhi obj ni refer cheyyakuda //
	System.out.println("my name "+a);	//okavela methods kakunda direct thiskunte oka object crete chesthe adhe excute avthadhi//
						//lekapothe method create chesthe pakka call cheyyali main class lo//

}
}
public class Svs{
public static void main(String args[])
{
	Btech obj=new Btech();
	
}
}
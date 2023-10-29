public class Methodovrlding {			//declaration of the class//

	 static int a(int a,int b,int c)	//declaration of the ffirst method//
	{

	return a+b+c;
	}
public static double a(double a,int b,int c)	//second method//
	{
	
	return a+b+c;
	}
public static double a(int a,double b,int c)	//third method//
	{
		return a+b+c;
	}

public static String a(String a )			//fouth method//
	{
		return a;	
	}
public static void main(String args[])	//main class//
	{
	System.out.println(a(10,20,30));				//this all are calling fuctions//
	System.out.println(a(10.4,20,30));
	System.out.println(a(10,20.7,30));
	System.out.println(a("vamshi this program is ended."));
}
}





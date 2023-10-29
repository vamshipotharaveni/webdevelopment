class Mthodover{
	 int add(int a, int b)
	{
	return a+b;
	}
double add(double a, int b)
	{
	return a+b;	
	}
public static void main(String args[])
	{
		Mthodover obj=new Mthodover();
		int c=obj.add(10,20);
	double d=	obj.add(15.5,12);
System.out.println(c);
System.out.println(d);
}
}

	
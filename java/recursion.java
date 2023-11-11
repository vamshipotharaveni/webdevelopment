public class recursion {
	static int f;
	public static int a(int x)
	{
		if(x==1)
	{
		return 1;
	}
	else
	{
	 	 f=x*a(x-1);
		
	}
		return f;
	}
	



public static void main(String args[])
{
	recursion obj=new recursion();
	int n=5;
	int t=obj.a(n);
	System.out.println(" "+t);
}



}	



		
		
		
		
	
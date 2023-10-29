	import java.util.Scanner;
	public class Factorial2 {	
	public static void main(String args[])
	{
	int a,fact=1;
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(int i=a;i>=1;i--)
	{
		fact=fact*i;
	}
	
		System.out.println(+fact);
	}
}


		
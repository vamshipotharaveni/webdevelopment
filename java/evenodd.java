import java.util.Scanner;
public class evenodd {
	public static void main(String args[])
	do{
	int a;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your number");
	a=sc.nextInt();
	int div=a%2;
	if(div==0);
	{
		System.out.println("even");
	}else
	{

		System.out.println("odd");
	}
}
}

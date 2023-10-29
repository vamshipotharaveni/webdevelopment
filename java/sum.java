import java.util.Scanner;
public class sum {
	static int printAdd(int x,int y,int z)
	{
		System.out.println("The total sum="  +(x+y+z));
		return x+y+z;
	}
	public static void main(String args[])
	{
	System.out.println("Enter the a,b,c values below");
	 Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	printAdd(a,b,c);
}
}
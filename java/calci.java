import java.util.Scanner;
public class calci {
	static int add(int x,int y)
	{
		System.out.println("yashu your sum  ="+(x+y));
		return x+y;
    }
	public static void main(String args[])
    	{
		int a,b;
		System.out.println("Hello Yashu please enter your a,b numbers <3");
		Scanner sc=new Scanner(System.in);	
		 a=sc.nextInt();
		 b=sc.nextInt();

		 add(a,b);
}
}
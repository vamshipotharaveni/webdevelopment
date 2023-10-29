import java.util.Scanner;
public class Project{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String a=sc.nextLine();
		System.out.println("Enter your age");
		int b=sc.nextInt();
		int i,d=100,c=0;

		if(b!=0)
		{
		 c=d-b;

}
		System.out.println("Your remaining years are "+c);
}
}
		
import java.util.Scanner;
public class hotel{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please order the food");
		System.out.println("1.chicken Biryani");
		System.out.println("2.mutton Biryani");
		System.out.println("3.chicken noodles");
		System.out.println("4.chicken manchuria");
		int a=sc.nextInt();
		switch(a)
			{
			case 1:	
			
			System.out.println("please collect your chicken Biryani have a nice day <3");
			System.out.println("your bill is = Rs.250/-");
			break;
			
			case 2:
			
			System.out.println("please collect your mutton biryani have a nice day");	
			System.out.println("your bill is = Rs.450/-");
			break;
			
			case 3:
			
			System.out.println("please collect your chicken noodles have a nice day");
			System.out.println("your bill is = Rs.70/-");
		
	
			break;
			
			case 4:
			
			System.out.println("please collect your chicken manchuria have a nice day");
			System.out.println("your bill is = Rs.100/-");
			
			break;	
				
			default:
			 System.out.println("Sorry your order is not available please select between 4 orders");
			}
	
}
}
	
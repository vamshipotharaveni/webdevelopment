import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int a,balance=100;
		System.out.println("Enter the value of 'a' between 1 to 5 ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		String Your_option;
		switch(a)
		{
			case 1:
				Your_option= "cash withdraw";
				System.out.println("please enter the amount ");
		System.out.println("The output=  "+Your_option);
			 	break;
			case 2:
				Your_option= "balence enqyiry";
				System.out.println("please enter the pin to check the balence");
			 	break;
			case 3:
				Your_option= "stop the process";
		System.out.println("The output=  "+Your_option);
			 	break;
			case 4:
				Your_option= "balence deposite";
		System.out.println("The output=  "+Your_option);
			 	break;
			case 5:
				Your_option= "balence close";
		System.out.println("The output=  "+Your_option);
			 	break;
			default:
				Your_option="invalid input please check <3";
		System.out.println("The output=  "+Your_option);

          }

		
	}		
		
}		
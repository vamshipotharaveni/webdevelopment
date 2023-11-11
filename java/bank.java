import java.util.Scanner;
public class bank{

	static int a, dipositAmount,withdrawAmount,balence=1000;

	 static Scanner sc= new Scanner(System.in);
	
	 static void deposit()
	 {
	 System.out.println("Enter the amount how much you want to deposit");

	 dipositAmount=sc.nextInt();

	  balence= dipositAmount+balence;	
	System.out.println("deposited sucessfully and current balence is "+balence);
	}
 static void withdraw()
	 {

	 System.out.println("Enter the amount how much you want to withdraw");

	 withdrawAmount=sc.nextInt();
	

	if(withdrawAmount>balence){

	System.out.println("insufficient balence");	

	}else

	{
	balence= balence-withdrawAmount;
	System.out.println("withdrwal sucessfully and current balence is "+balence);
	}
	}
 static void enquiry()
	 {
	 System.out.println("available balnce in your account is "+balence);
	}
 static void exit()

	 {
	 System.out.println("thank you for bamking!");
	}

public static void main(String args[]){
	do{
		System.out.println("welcome to vamshi banking choose any option you want");
		System.out.println("1.deposite");
		System.out.println("2.withdraw");
		System.out.println("3.balence enquiry");
		System.out.println("4.exit");

	 a=sc.nextInt();

	  switch(a){

	 case 1:
		deposit();
		break;

        case 2:
		withdraw();
		break;

	case 3:
	     	enquiry();
		break;

	case 4:
		 exit();
		 break;

	default:
	System.out.println("");
	}
      }while(a!=4);
 }
}
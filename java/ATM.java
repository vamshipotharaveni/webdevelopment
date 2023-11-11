import java.util.Scanner;

public class ATM{

	public static void main(String[] args){
		executeATM();
	}

	public static void executeATM(){

		int balance = 1000;

		int choice = 1;
			
		Scanner sc = new Scanner(System.in);
	do{
		System.out.println("Enter the Following Choice");
		System.out.println("1. Balance Enquiry");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		choice = sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("You Current Balance is: "+balance);
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn");
				int withdrawAmount = sc.nextInt();
				if(withdrawAmount <= balance){
					balance -= withdrawAmount; //balance = balance-withdrawAmount
					System.out.println("The "+withdrawAmount+" debited from your account");
					System.out.println("You Current Balance is: "+balance);
				}else{
					System.out.println("In Sufficient Funds");	
				}
				break;
			case 3:
				System.out.println("Enter the amount to be deposited");
				int depositAmount = sc.nextInt();
				System.out.println("The "+depositAmount+" credited to your account");
 				balance += depositAmount;
				System.out.println("You Current Balance is: "+balance);
				break;
			case 4:
				System.out.println("Thanks for banking with us");
			default:
				System.out.println("Invalid Output");
				
		}
	}while(choice != 4);

   }

}
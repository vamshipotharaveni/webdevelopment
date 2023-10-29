import java.util.Scanner;
class myatm {
    public static void main(String[] args) {

        int balance=1000, withdraw,deposite;

        Scanner sc=new Scanner(System.in);
        System.out.println("choose one of the below");
        System.out.println("  ");
        System.out.println("Enter 1 for withdrawal");
        System.out.println("Enter 2 for deposite");  
        System.out.println("Enter 3 for balence enquiry");
  	  System.out.println("Enter 4 to close");
       int a=sc.nextInt();
        switch (a)
        {
        case 1:
            System.out.println("enter your withdraw amount");
            withdraw =sc.nextInt();
		if(withdraw>=balance){
			System.out.println("insufficient balance <3");
			}else{
          
            balance=balance - withdraw;{
                System.out.println("your current balance = "+balance);
			}
            }
            break;
         case 2:
             System.out.println("enter your deposite amount");
             deposite=sc.nextInt();
             balance=balance + deposite;
             {
                 System.out.println("successfully credited your balance ="+balance);
             }
             break;
         case 3:
             System.out.println("your current balance is = "+balance);
		break;
	  case 4:
		System.out.println("thank you for banking <3");
		break;
         default:
         System.out.println("invalid choice");
        } 
 
    }
}

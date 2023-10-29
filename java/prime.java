import java.util.Scanner;
public class prime{
    public static void main(String args[]) 
    {
        int i,count=0,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        x=sc.nextInt();
        if(x>1){
            for(i=1;i<=x;i++){
                if(x%i==0){
                 count++;   
                }
          
            }
            if(count==2)
            System.out.println(x+" is a prime number");
		
        }
	if(count!=2){
	 System.out.println("it is not a prime number");
	}
        else 
        {
            System.out.println("it is not a prime number");
        }
    }
}
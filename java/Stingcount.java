import java.util.Scanner;

public class Stingcount {
    
	public static void main(String[] args) {
     
		Scanner sc =new Scanner(System.in);
        	
		System.out.println("enter a string");
        		
		String a=sc.nextLine();
        
      	int count=0;           //this is a intialization of the var//

       	for(int i=0;i<a.length();i++){             //this line explainning that oka "i" anedhi nuv ichhina String anni aphabets vunte antha numbers peruguthadhi// 


       		 if(a.charAt(i)!=' ' && a.charAt(i)!='a'){  //this line explaining that manam ichin string lo a ni inka space ni count cheyyadhhi ani//


        			  count++;           //ivi kakunda unnavatiki count peragali//

        			}
        
      	  }
     
     		 System.out.println("the total count is = "+count);
 	 }
}
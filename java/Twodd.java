import java.util.Scanner;
public class Twodd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the rows");
        int i=sc.nextInt();
        
        System.out.println("Enter the size of the column");
        int j=sc.nextInt();
        
        int[][] a=new int[i][j]; 
         System.out.println("enter the values in the matrix");       /*dhintlo manam  valuues assign cheyyadaniki scanner tho cheyyalanna kuda multi loop lone rayali beacuse
									andhuku ante assl row clmn kalipe rastham kabatti*/							
        for(i=0;i<a.length;i++)
        {
         for(j=0;j<a.length;j++){
            
            a[i][j]=sc.nextInt();
         }
       
        }
         for(i=0;i<a.length;i++)
        {
        for(j=0;j<a.length;j++)
	{
        System.out.print(" "+a[i][j]);
	}
	System.out.println("");
        }
         
    }
}
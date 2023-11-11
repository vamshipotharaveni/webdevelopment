import java.util.Scanner;
public class matrix{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		String[][] a=new String[3][3];

		System.out.println("Enter the rows and cols");
		for(int i=0;i<a.length;i++){
	      	for(int j=0;j<a[0].length;j++){
			 a[i][j]=sc.nextLine();
			}
		}
		System.out.println("This is the matrix");
			for(int i=0;i<a.length;i++){
	      	for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
				}
					System.out.println( );
		}
}
}	
			
		
		
		
		
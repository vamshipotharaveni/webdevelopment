import java.util.Scanner;
public class matrixstring{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the no of rows");
		int b=sc.nextInt();
		System.out.println("entr the no of cols");
		int c=sc.nextInt();

		String[][] a=new String[b][c];

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
			
		
		
		
		
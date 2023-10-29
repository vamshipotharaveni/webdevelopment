import java.util.Scanner;
public class Tdarray{

	public static void main(String args[])

	{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the row values");

	int i=sc.nextInt();
	
	System.out.println("enter the colum values");

	int j=sc.nextInt();

	int[][] array=new int[i][j];

	for(i=0;i<array.length;i++)

	{
	for(j=0;j<array.length;j++)
	
	System.out.print(+array[i][j]);

	}

	System.out.println("");

	}
}

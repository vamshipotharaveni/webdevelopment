import java.util.Scanner;
	public class usermtx{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter how many rows you want  <3");
		int rows=sc.nextInt();
		System.out.println("enter how many cols you want  <3");
		int cols=sc.nextInt();
		int[][] a=new int[rows][cols];
		for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
		System.out.println("entr the inputs");	
		a[i][j]=sc.nextInt();
		}
	for(i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
		System.out.print(a[i][j]+" ");
		}
				System.out.println( );	
}

}
}
}
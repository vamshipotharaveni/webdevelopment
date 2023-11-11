import java.util.Scanner;
public class Arr{
    public static void main(String x[])
    {
        int i=0;
        int a[]=new int[8];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers up to 8");
        
        for(i=0;i<a.length; i++){
         a[i]=sc.nextInt();
        }
         for(i=0;i<a.length; i++){
             System.out.println("numbers are"+a[i]);
    }
}
}

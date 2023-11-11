import java.util.Scanner;
public class Calculater{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your first number");
		int a=sc.nextInt();
		System.out.println("please enter your second number");
		int b=sc.nextInt();
		System.out.println("please enter your  symbol =  +  -   *  /   % ");
		String c=sc.next();
		
		switch(c)
		{
		case "+":
			int addition=a+b;
			System.out.println(+addition);
			break;
		case "-":
			int sub=a-b;
			System.out.println(+sub);
			break;
		case "*":
			int mul=a*b;
			System.out.println(+mul);
			break;
		case "/":
			int div=a/b;
			System.out.println(+div);
			break;
		case "%":
			int per=a%b;
			System.out.println(+per);
			break;
		default:
			System.out.println("your input symbol is invalid!");
		}
	}
}
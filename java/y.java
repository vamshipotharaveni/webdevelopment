class v extends Thread{
	

	public void run(){
	int a=10;
	int b=20;

	
	System.out.println("this is output "+(a+b));
	
	}
}
public class y{
public static void main(String args[]){
	v obj=new v();
	Thread obj1=new Thread(obj);
	obj1.start();
}
}
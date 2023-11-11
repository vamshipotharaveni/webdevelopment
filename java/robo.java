public class robo extends Thread{
		int a=10;
		int b=20;
	public void run(){
		
		int result =a+b;
	
	System.out.println(+result);
}
public static void main(String args[]){
	robo obj= new robo();
	Thread obj1=new Thread(obj);

}
}
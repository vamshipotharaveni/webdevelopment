public class v extends Thread{
		
	public void run(){
		
		
	
	System.out.println("this is a statement ");
}
}
class y{
public static void main(String args[]){
	v obj= new v();
	Thread obj1=new Thread(obj);
	obj1.start();

}
}

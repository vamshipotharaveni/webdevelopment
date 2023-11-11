public class V extends thread{
		int a=10;
		int b=20;
	int run(){
		
		result =a+b;
	
	System.out.println(+result);
}
public static void main(String args[]){
	V obj= new v();
	thread obj1=new thread(obj);

}
}
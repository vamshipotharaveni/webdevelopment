abstract class Method {
	
	int a=10;
	int b=20;
	int c;
	
	abstract void method();
	 
	int add(){
	c=a+b;
	return c;
	}
}
class Second extends Method{
	
	void method(){
	System.out.println("this is my line");
	add();
	}
}
public class Abstraction{
public static void main(String args[])
	{
	Second obj= new Second();
	obj.method();
	System.out.println("this is a ans "+obj.c);
	
	}
	
}



	
	
	
	
	
	
	
	
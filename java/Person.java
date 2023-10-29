public class Person{
	int i;	//pogram using constructor//

	String name;
	int age;
	String gmail;

	Person(String a,int b,String c)
	{
	name=a;
	age=b;
	gmail=c;

	}
  public void loop(){
  for(i=1;i<=10;i++)
  	{

	}
System.out.println("welcome no."+i);
	}
public static void main(String args[]){
	String x="vamshi";
	int y=20;
	String z="potharavenivamshi@gmail.com";
	Person obj=new Person(x,y,z);
	System.out.println("name:"+obj.name);
	System.out.println("age:"+obj.age);
	System.out.println("Mail:"+obj.gmail);

}
}
	
	
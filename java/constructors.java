public class constructors {
	
	 constructors(String x, String y)
	{
		String s="vamshi";
		System.out.println(s+" this is output ="+y);
	System.out.println("this is output line2 "+x);
}
	
	public static void main(String args[]){
	String a,b,c,d;
	a="ajay";
	b="vamshi";
	c="raviteja";
	d="rajkumar";
	
	constructors obj=new constructors(a,b);
	constructors obj1=new constructors(b,c);
	constructors obj2=new constructors(c,d);
	
}
}

public class Constructor2{
	String car1;
	String car2;
	int modal;
	
	Constructor2(String swift,String tata,int date){
	
		car1=swift;
		car2=tata;
		modal=date;
		
		}							  //parametarised constructor //  

	public static void main(String args[]){
            String a="It was swift";
            String b="It was tata";
            int c=2003;
			Constructor2 obj=new Constructor2(a,b,c);

			System.out.println("swift:"+obj.car1);
			System.out.println("tata:"+obj.car2);
			System.out.println("date:"+obj.modal);

		
}
}


	
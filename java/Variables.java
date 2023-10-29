public class Variables{

	public int a=1;

	public static int b = 20;

	public static void main(String[] args){
		Variables v = new Variables();
		Variables v2 = new Variables();
		v2.b = 25;		
		v2.a = 20;
		System.out.println(v.a+" "+b);
		System.out.println(v2.a+" "+b);
		int b = 2;

		for(int i = 0 ;i < 10; i++){
			System.out.println(i);
		}

		//System.out.println(i);
	}

	public static void printNum(){
		Variables v = new Variables();
		System.out.println(v.a);
		//System.out.println(b);
	}

}
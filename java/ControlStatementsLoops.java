public class ControlStatementsLoops{

	public static void main(String[] args){

		int x = 5;
		/*
		for(int i=0; x < 10; x = x * 5){
			System.out.println(i+" "+x);
			i++;
		}*/

		while(x < 1000){
			System.out.println(x);
			x = x*5;
		}

System.out.println("----------------");
	x = 1200;
		do{
			System.out.println(x);
			x = x*5;
			
		}while(x < 1000);

		String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

		for(String s: arr){
			System.out.println(s);
		}
	}

	

}
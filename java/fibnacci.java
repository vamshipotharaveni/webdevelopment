public class fibnacci{
    	public static void main(String rgs[])
	{
		int n1=0,n2=1,n3=2,n4,i,count=10;
		System.out.println(n1+""+n2);

	for(i=3;i<count;++i)
	{
	n4=n1+n2+n3;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	n3=n4;
	}

	}

}
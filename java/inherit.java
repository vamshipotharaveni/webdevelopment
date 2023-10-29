class Vmsi{
		static String v="my name is vamshi";{
	System.out.println("this is "+v);
	}
}
 class dad extends Vmsi{
	static String s="my father name is sampath";{
	System.out.println("this is "+s);
	}
}
class mom extends dad{
		static String r="my name mother name is renuka";{
	System.out.println("this is "+r);
	}
}
class sis extends mom{
	static String s1="my sis namr is sushma";{
	System.out.println("this is "+s1);
	}
}

class inherit{	
	public static void main(String args[])
	{
		
		sis obj=new sis();
}
}

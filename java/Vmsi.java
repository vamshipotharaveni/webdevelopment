class Vmsi{
	String v="my name is vamshi";{
	System.out.println("this is "+v);
	}
}
 class dad extends Vmsi{
	String s="my father name is sampath";{
	System.out.println("this is "+s);
	}
}
class mom extends dad{
	String r="my name mother name is renuka";{
	System.out.println("this is "+r);
	}
}
class sis extends mom{
	String s1="my sis namr is sushma";{
	System.out.println("this is "+s1);
	}
}
class inherit{	
	public static void main(String args[])
	{
		Vmsi obj=new Vmsi();
		obj.s1();
}
}
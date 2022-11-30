package opps_static_keyword;

public class Program8 {
	{
		System.out.println("This is a non-static block-1");
	}
	
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		Program8 p=new Program8();
		Program8 p1=new Program8();
		Program8 p2=new Program8();
	}
	
	
	{
		System.out.println("this is a non-static block-2");
	}

}

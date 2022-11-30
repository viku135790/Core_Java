package opps_static_keyword;

public class Program5 {
	static int i=70;
	
	
	//first
	static
	{
		
		System.out.println("This is static block-1: "+i);
	}
	
	
	//Third execution
	public static void main(String[] args) {
		System.out.println("this is main method");
	}
	
	
	//second
	static
	{
		i=50;
		System.out.println("This is static block-2: "+i);
	}

}

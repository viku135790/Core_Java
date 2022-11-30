package opps_static_keyword;

public class Program9 {
	{
		System.out.println("This is a non-static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		Program9 p=new Program9();
		return ;
		
	}
	
	
	{
		System.out.println("this is a non-static block-2");
		//Program9 p=new Program9();
	}


}

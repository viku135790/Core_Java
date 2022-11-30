package opps_static_keyword;

public class Program4 {
	static int a=35;
	static int b=test();
	
	public static void main(String[] args) {
		System.out.println("Main method: "+a+"  "+b);
		a=77;
		int b=66;
		int c= test();
		System.out.println(a+"    "+b+"  "+c);
	}
	public static int test()
	{
		System.out.println("test method "+a+"  "+b);
		a=45;
		int b=15;
		System.out.println(a+"  "+b);
		return a+b;
	}

}

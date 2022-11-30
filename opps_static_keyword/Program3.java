package opps_static_keyword;

public class Program3 {
	static int a=25;
	static int b;
	
	public static void main(String[] args) {
		System.out.println("This is main method = "+a+" "+b);
		test();
		System.out.println(a+" "+b);
	}
	public static void test() {
		a=30;
		int b=30;
		System.out.println("This is test method = "+a+" "+b);
	}

}

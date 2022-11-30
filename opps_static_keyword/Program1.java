package opps_static_keyword;

public class Program1 {
	//static method loaded inside the stack area.
	public static void main(String[] args) {
		System.out.println("this is prog1 method");
		test();
		System.out.println("Main method ends");
		
	}
	public static void test() {
		System.out.println("This is test method");
		int i=10;
		System.out.println("i is = "+i);
	}

}

package opps_static_keyword;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		//We can call static members withough object creation 
		Program1.test();
		System.out.println("Program2 main method ends");
	}

}

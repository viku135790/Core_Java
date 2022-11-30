package opps_method_overloading;
//by changing the sequence

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Calu {
	public static void main(String[] args) {
		System.out.println("This is main method");
		add(45,45.458);
		add(45.25,458);
	}
	public static void add(int a, double b) {
		System.out.println("The sum of "+(a+b));
	}
	public static void add(double a ,int b) {
		System.out.println("The sum of "+(a+b));
	}

}

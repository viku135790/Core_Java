package opps_method_overloading;
//By different type

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Cal {
	public static void main(String[] args) {
		System.out.println("This is main method");
		add(45+458);
		add(45.255);
	}
	public static void add(int a, int b) {
		System.out.println("The sum of "+(a+b));
	}
	public static void add(double b) {
		System.out.println(b);
	}

}

package opps_method_overloading;
//By different parameter

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Calculetor {
	public static void main(String[] args) {
		System.out.println("This is main method");
		add(45+35);
		add(45);
	}
	public static void add(int a, int b) {
		System.out.println("The sum of "+(a+b));
	}
	public static void add(int a) {
		System.out.println(a);
	}

}

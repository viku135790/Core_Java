package opps_main_method_overloading;

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Car {
	public static void main(String[] args) {
		System.out.println("This is main method");
		main('n');
		main(25);
		
	}
	public static void main(char args) {
		System.out.println("This is char main method");
	}
	public static void main(int args) {
		System.out.println("this is int main method");
	}

}

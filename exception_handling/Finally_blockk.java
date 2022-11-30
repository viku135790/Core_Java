package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Finally_blockk {
	public static void main(String[] args) {
		System.out.println("starts");
		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
		finally {
			System.out.println("Always Execute");
		}
		System.out.println("Ends");
	}

}

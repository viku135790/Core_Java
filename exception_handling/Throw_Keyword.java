package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Throw_Keyword {
	public static void main(String[] args) {
		System.out.println("starts");
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
		
	}

}

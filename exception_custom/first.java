package exception_custom;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class first extends Exception {
	public static void main(String[] args) {
		try {
			checkAge(15);
		}
		catch(Exception e) {
			System.out.println("under age");
		}
		
	}

	public static void checkAge(int i) throws UnderAgeException {
		if(i>=18) {
			System.out.println("Eligible to vote");
			
		}
		else {
			throw new UnderAgeException();
		}
		
	}

}

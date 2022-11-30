package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Use_Way_Try_Catch {
	public static void main(String[] args) {
		
		try {
			checkEligibility(15);
		}
		catch(Exception e) {
			System.out.println("under age");
			//to know the details of exception
			System.out.println(e);
			//to trace the exception
			System.out.println("=============");
			e.printStackTrace();
		}
	}

	public static void checkEligibility(int i) {
		if(i>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			throw new ArithmeticException();
		}
		
	}

}

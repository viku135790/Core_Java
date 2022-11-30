package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.Scanner;

public class Exception_Hierarchy {
	public static void main(String[] args) {
		System.out.println("starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		System.out.println(25+78-458*25);
		
		try {
			System.out.println(a/b);
		}
		catch(NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("infinity result");
		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception is caught");
//		}
		System.out.println(325+56565);
		System.out.println("Ends");
	}

}

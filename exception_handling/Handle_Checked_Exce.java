package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.*;

public class Handle_Checked_Exce {
	public static void main(String[] args) {
		System.out.println("starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		System.out.println(25+78-458*25);
		
		
		try {
			//Error can be produce here for exp input a=10; b=0;;
			System.out.println(a/b);
		}
		//we can write Exception e
		catch(ArithmeticException e){
			System.out.println("Error found");
		}
		System.out.println(25+48*45-458);
		System.out.println("Ends");
		
	}

}

package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.io.*;
import java.io.FileNotFoundException;

public class Multiple_Try_Catch {
	public static void main(String[] args) {
		System.out.println("main method start");
		//compile time exception
		
		//comment out object and see the result
		
		try {
			FileInputStream fis=new FileInputStream("D:/vikas.txt");
			System.out.println("File found");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		
		try {
			System.out.println(10/0);
			System.out.println("Execution done");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
		
	}

}

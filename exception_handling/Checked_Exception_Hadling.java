package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.io.*;

public class Checked_Exception_Hadling {
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
		
	}

}

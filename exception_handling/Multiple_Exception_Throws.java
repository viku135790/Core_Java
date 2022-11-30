package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.io.*;

public class Multiple_Exception_Throws {
	public static void main(String[] args) throws FileNotFoundException, NullPointerException {
		FileInputStream fis=new FileInputStream("D:/vikas.txt");
		System.out.println("File found");
	}

}

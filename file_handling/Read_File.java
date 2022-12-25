package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_File {
	public static void main(String[] args) {
		File f=new File("d:\\hello.java");
		try {
			Scanner sc=new Scanner(f);
			while(sc.hasNext()) {
				String s=sc.nextLine();
				System.out.println(s);
//				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

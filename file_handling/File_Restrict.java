package file_handling;

import java.io.File;
import java.io.IOException;

public class File_Restrict {
	public static void main(String[] args) {
		File f1=new File("d:\\hello.java");
		try {
			f1.createNewFile();
			System.out.println("File created sucessfully");
		} catch (IOException e) {
			System.out.println("Something else");
			e.printStackTrace();
		}
		
//		f1.setWritable(false);//restrict the modification
		f1.setWritable(true);
	}

}

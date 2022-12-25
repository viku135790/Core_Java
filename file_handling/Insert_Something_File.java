package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Insert_Something_File {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("d://hello.txt");
			fw.write("hello file writer");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File created deta stored");
	}

}
  
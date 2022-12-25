package file_handling;
import java.io.*;

public class Acess_All_File {
	public static void main(String[] args) {
		File f1=new File("d:\\");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.getName());
		String x []=f1.list();
		
		for (String s : x) {
			System.out.println(s);
		}
	}
}

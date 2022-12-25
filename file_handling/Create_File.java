package file_handling;
import java.io.File;
import java.io.IOException;

public class Create_File {
	public static void main(String[] args) {
		File f1=new File("d:\\hello.java");
		try {
			f1.createNewFile();
			System.out.println("File created sucessfully");
		} catch (IOException e) {
			System.out.println("Something else");
			e.printStackTrace();
		}
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.length());
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
	}

}

package exception_handling;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Finally_Block {
	public static void main(String[] args) {
		System.out.println("starts");
		try {
			System.out.println(10/0);
		}
		finally {
			System.out.println("Always Execute");
		}
		System.out.println("Ends");
	}

}

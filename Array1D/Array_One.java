package Array1D;
//import java.util.Scanner;
public class Array_One {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=20; i>=10; i--) {
			//System.out.println(i);
			count++;
		}
		
		int a []=new int[count];
		for(int i=0; i<a.length; i++) {
			//System.out.println(a[i]);
			for(int j=20; j<=10; j--) {
				System.out.println(j);
				a[i]=j;
				System.out.print(a[0]);
			}
			
		}
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
	}

}


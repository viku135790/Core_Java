package Array1D;
import java.util.*;
public class Third {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);{
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int num[]= new int[size];
			
			for(int i=1; i<size; i++) {
				System.out.println("Enter value inside index");
				num[0]=sc.nextInt();
			}
			
			for(int i=0; i<size; i++) {
				System.out.println(num[i]);
			}
		}
	}
}

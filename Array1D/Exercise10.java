package Array1D;
import java.util.*;
public class Exercise10 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index max number");
	int n=sc.nextInt();
	
	 int[] num=new int[n];
	 
	 for(int i=0; i<n; i++) {
		System.out.println("Assign the valuem in the index");
		 num[0]=sc.nextInt();
	 }
	 for(int i=0; i<n; i++) {
		 System.out.println(num[n]);
	 }
}
}

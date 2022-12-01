package Array1D;
import java.util.*;
public class User_Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l=sc.nextInt();
		
		int[] arr=new int[l];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the number");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}

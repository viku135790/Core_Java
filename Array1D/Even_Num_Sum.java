package Array1D;
import java.util.*;
public class Even_Num_Sum {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length of array");
			int l=sc.nextInt();
			
			int[] arr=new int[l];
			System.out.println("Enter the number");
			for(int i=0; i<arr.length; i++) {
				arr[i]=sc.nextInt();
				
			}
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				if(i%2==0 && i!=0) {
					sum=sum+arr[i];
				}
			}System.out.println(sum);
			
		}
	}


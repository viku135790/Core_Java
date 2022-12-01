package Array1D;
import java.util.*;
public class AVG {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			double[] arr=new double[10];
			double sum=0;
			System.out.println("Enter the number");
			for(int i=0; i<10; i++) {
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			double a =sum/10;
			System.out.println(a);
		}
		
		
	}

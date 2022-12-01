package Array1D;
import java.util.*;
public class User_Inpu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter th e array value");
		int a[]= new int[5];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+",");
		}
		/*int a[]= {2,4,6,8,9,10};
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+",");*/
		
	}
}

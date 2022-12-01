package Array1D;

//find the Occurence 
import java.util.*;
public class Occurence {
	public static void main(String[] args) {
		int [] x = {100,20,30,10,10,60,10,45,10,10,30,10,20};
		FirstOccurence(x);
		LastOccurence(x);
		totalOccurence(x);
	}

	public static void totalOccurence(int[] x) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the last occurance");
		int n=sc.nextInt();
		
		int count=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]==n) {
				count++;
			}
		}
		System.out.println("Total count = "+count);
	}

	public static void LastOccurence(int[] x) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the last occurance");
		int n=sc.nextInt();
		
		int number=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]==n) {
				number=i;
				
			}
		}
		System.out.println("last occurance at = "+number);
	}

	public static void FirstOccurence(int[] x) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the first occurance");
		int n=sc.nextInt();
		
		int number=0;
		
		for(int i=0; i<x.length; i++) {
			if(x[i]==n) {
				number=i;
				break;
			}
			
		}
		System.out.println("first occurance at = "+number);
		
	}
}

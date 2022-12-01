package Array1D;
import java.util.*;
public class ForEach2 {
	public static void main(String[] args) {
		int a[]= {100,10,20,85,35,10,10,10,10,40,60,70,30,10};
		int b=index(a);
		System.out.println(b);
		
	}
	public static int index(int a []) {
		
		int c=0;
		int s=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0; i<a.length; i++) {
			if(a[i]==n) {
				c++;
				if(c==4) {
					s=i;
				}
				
			}
			
		}
		return s;
	
	}

}

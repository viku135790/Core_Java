package Array1D;
import java.util.*;
public class Method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int [] a=new int[10];
		/*int [] a= {1,3,5,7,8};*/
		int s=sum(a);
		System.out.println(s);
		int o=odd(a);
		System.out.println(o);
		int e=even(a);
		System.out.println(e);
	}
	public static int sum(int [] b) {
		int sum=0;
		for(int i=0; i<b.length; i++) {
			sum=sum+b[i];
		}
		return sum;
	}
	public static int odd(int [] c) {
		int oddsum=0;
		for(int j=0; j<c.length; j++) {
			if(c[j]%2!=0) {
				oddsum=oddsum+c[j];
			}
		}
		return oddsum;
	}
	public static int even(int [] d) {
		int evensum=0;
		for(int k=0; k<d.length; k++) {
			if(d[k]%2==0) {
				evensum=evensum+d[k];
			}
		}
		
		return evensum;
	}

}

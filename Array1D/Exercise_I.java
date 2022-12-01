package Array1D;

public class Exercise_I {
	public static void main(String[] args) {
		int a[]= {10,58,36,7,5,2,28,3,91};
		
		prime(a);
		
	}
	public static void prime(int[] a) {
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			int count=0;
			int r=a[i];
			for(int j=2; j<=r; j++) {
				if(r%j==0) {
					count++;
				}
			}
			if(count==1) {
				sum=sum+r;
				System.out.println(r);
				
			}
			
		}
		System.out.println(sum);
	}
}
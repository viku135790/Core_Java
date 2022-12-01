package Array1D;

public class Exercise_H {
	public static void main(String[] args) {
		int a[]= {10,50,4,50,40,8,35,90,30,80,100,5};
		
		int b=10;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				 if(a[j]<b) {
					 b=a[j];
				 }
			}
		}
		System.out.println(b);
	}
	}

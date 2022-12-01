package Array1D;

public class Max {
	public static void main(String[] args) {
		int a[]= {2,7,11,4,3,2};
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

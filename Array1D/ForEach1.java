package Array1D;

public class ForEach1 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=100; i++) {
			count++;
		}
		int a []=new int[count];
		for(int j=1; j<=100;) {
			for(int i=0; i<a.length; i++){
				a[i]=j;
				j++;
				System.out.println(i);
			}
			System.out.println("===================");
			System.out.println(a[50]);
		}
	}

}

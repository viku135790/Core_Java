package Array1D;

public class ForEach {
	public static void main(String[] args) {
		int a []= {10,20,30,40,50};
		//With the help of for loop
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("+++++++++++++++++++++++++++");
		//With the help of each for loop
		
		for(int i  : a) {
			System.out.println(i);
		}
	}

}

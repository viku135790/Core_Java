package Array1D;

public class Sortting {
	public static void main(String[] args) {
		int a[]= {75,80,10,20,48,45,75};
		
		int re []=sortAsc(a);
		for(int i=0; i<re.length; i++) {
			System.out.print(re[i]+ "  ");
		}
		
	}
	public static int [] sortAsc(int a[]) {
		boolean isSort=true;
		int b=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
					
					isSort=false;
				}
			}
			if(isSort=true)
				break;
		}
		return a;
	}

}

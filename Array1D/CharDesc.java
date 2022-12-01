package Array1D;

public class CharDesc {
	public static void main(String[] args) {
		char c[]= {'b', 'a', 'd', 'a', 'c'};
		
		char[] xm=descSort(c);
		for(int i=0; i<xm.length; i++) {
			System.out.println(xm[i]);
		}
		
	}
	public static char[] descSort(char c[]) {
		boolean isSort=true;
		char ax=' ';
		for(int i=0; i<c.length-1; i++) {
			for(int j=0; j<c.length-1-i; j++) {
				if(c[j]<c[j+1]) {
					ax=c[j];
					c[j]=c[j+1];
					c[j+1]=ax;
					isSort=false;
				}
			}
			if(isSort==true)
				break;
		}
		
		return c;
	}

}

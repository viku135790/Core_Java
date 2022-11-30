package var_args;

/*if any program is wrong then report on (viku135790@gmail.com);
 * Or u can mail your question (viku135790@gmail.com) */

public class Var_Args {
	//variable arguments
	//Method overloading concents
	
	public static void main(String[] args) {
		sum(145, 458);
		sum(145, 458,258);
		sum(145, 458,41545,458);
		sum(145, 458,1545,458,45854);
		
		//no need to create multiple methods
		
	}

	public static void sum(int...a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}

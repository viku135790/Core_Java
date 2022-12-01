package Array1D;

public class Find_Prime {
	public static void main(String[] args) {
		int [] arr= {2,3,11,17,15};
		
		
		
		for(int j=0; j<arr.length; j++) {
			boolean isPrime = true;
			for(int i =2;i<arr[j]/2;i++) {
				
				if(arr[j]%i==0) {
				isPrime = false;
				}
			}
			
		
			if(isPrime==true){
				System.out.println(arr[j]);
			}
		}
	}

}

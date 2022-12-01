package Array1D;
public class Sum_PN {
		public static void main(String[] args) {
			int [] arr= {2,3,11,17,15};
			
			double sum = 0;
			double count = 0;
			
			for(int j=0; j<arr.length; j++) {
				boolean isPrime = true;
				for(int i =2;i<arr[j]/2;i++) {
					
					if(arr[j]%i==0) {
					isPrime = false;
					break;
					}
				}
				
			
				if(isPrime==true){
					sum += arr[j];
					count++;
				}
			}
			System.out.println(sum);
			double avg = sum/count;
			System.out.println("average is "+ avg);
		}

	}

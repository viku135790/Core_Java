package Array1D;

public class DescOrder {
		public static void main(String[] args) {
			int n[]={11,2,7,4,3,2};
			
			int t=0;
			
			for(int j=0; j<n.length; j++)
			{
			for(int i=0; i<n.length-1; i++)
			{
				if(n[i]<n[i+1])
				{
					//swapping
					t= n[i];
					n[i]=n[i+1];
					n[i+1]=t;
				}
			}
			}
			for(int i=0; i<n.length;i++) {
				System.out.print(n[i]+"  ");
			}
		}

	
}

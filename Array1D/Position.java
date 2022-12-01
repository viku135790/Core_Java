package Array1D;
import java.util.Scanner;

public class Position {
	public static void main(String[] args) {
		int [] arr = {100,20,30,10,10,60,10,45,10,10,30,10,20};
		int firstindex=firstAccurence(arr);
		System.out.println("the first accurence of element is at "+firstindex+" index position");
		System.out.println("============================");
		int lastindex=lastAccurence(arr);
		System.out.println("the first accurence of element is at "+lastindex+" index position");
		System.out.println("============================");
		int nthindex=nthAccurence(arr);
		System.out.println("the first accurence of element is at "+nthindex+" index position");
		
	}

	
	public static int firstAccurence(int [] arr) 
	{
		int count = 0;
		int firstindex = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find its firstaccurence");
		int n = sc.nextInt();
		//First accurence
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==n) {
				count++;
				firstindex=i;
				break;
			}
		}
		return firstindex;
		
	}
	//Last Accurence
	public static int lastAccurence(int [] arr) 
	{
		int count = 0;
		int lastindex = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find its lastaccurence");
		int n = sc.nextInt();
		//First accurence
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==n) {
				count++;
				lastindex=i;
				
			}
		}
		return lastindex;
		
	}
	//nth Accurence
		public static int nthAccurence(int [] arr) 
		{
			int count = 0;
			int nthindex = -1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the element to find its nthaccurence");
			int n = sc.nextInt();
			//First accurence
			for(int i = 0;i<arr.length;i++)
			{
				if(arr[i]==n) {
					count++;
					//(count == n) here change n according to find the nth acuurence as 5 for 5th
					if(count==5) 
					{
					nthindex=i;
					}
					
				}
			}
			return nthindex;
			
		}
}

package opps_polymorphism;

/*if anything wrong teh report on this link
 * https://www.linkedin.com/in/vikas-kumar-517994229/
 * */

public class CompileTime {
	public static void main(String[] args) {
		test(10,20);
		test(25,25.23);
	}
	
	public static void test(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void test(int x, double y) {
		System.out.println(x+y);
	}

}

/*
 * 	or-----------------------------
 * 
 * 	public void test(int a)
 * 		{
 * 			sop(a*5);
 * 		}
 * 
 * 	public static void test(double b)
 * 		{
 * 			sop(b);
 * 		}
 * 
 * 
 *   or-----------------------------
 *   
 *   public static void test(int a, double b)
 *   	{
 *   		sop(a*b);	
 *   	}
 *   public static void test(double b, int a)
 *   		{
 *   			sop(a*b);	
 *   		}
 * */

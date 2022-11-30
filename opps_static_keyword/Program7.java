package opps_static_keyword;

public class Program7 {
	static int i=70;
	static int j=test();
		static
		{
			System.out.println("This is static block-1: "+i+"  "+j);
			int i=45;
			j=60;
		}
		public static void main(String[] args) {
			System.out.println("this is main method: "+i+"  "+j);
			i=63;
			int p=test();
			System.out.println(i+"    "+j+"   "+p);
		}
		static
		{
			System.out.println("This is static block-2: "+i+"  "+j);
			i=93;
		}
		public static int test()
		{
			System.out.println(i+"  "+j);
			i=25;
			return i+j;
		}

}

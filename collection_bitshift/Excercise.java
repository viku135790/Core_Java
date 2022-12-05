package collection_bitshift;

import java.util.*;
public class Excercise {
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(25);
		a.add(35);
		a.add("anshul");
		a.add("vikas");
		a.add(25);
		
		System.out.println(a);
		
		a.add(3, "missed");
		//bit shift
		System.out.println(a);
	}

}

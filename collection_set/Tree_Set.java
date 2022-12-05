package collection_set;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		ts.add(45);
		ts.add(48);
		ts.add(798);
		ts.add(78);
		ts.add(10);
		ts.add(80);
		ts.add(100);
		ts.add(50);
		
		System.out.println(ts);
		
		for(Object o: ts) {
			System.out.println(o);
		}
		
		//Object stored in increasing order
	}

}

package collection_map;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.TreeMap;

public class Tree_Map {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		
		tm.put(2, "Vimal");
		tm.put(5, "Piyush");
		tm.put(3, "Ashish");
		tm.put(4, "Anshul");
		tm.put(23, "vikas");
		tm.put(6, "Piyush");
		
		tm.put(2, "Pankaj");//value of 2 will be updated
		
		System.out.println(tm);
		
		//stored based on the key value pair in sorted manner
	}

}

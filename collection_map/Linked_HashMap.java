package collection_map;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.LinkedHashMap;

public class Linked_HashMap {
	public static void main(String[] args) {
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(2, "Vimal");
		lhm.put(5, "Piyush");
		lhm.put(3, "Ashish");
		lhm.put(4, "Anshul");
		lhm.put("vikas", 23);
		lhm.put(6, "Piyush");
		lhm.put(2, "Pankaj");//value of 2 will be updated
		
		System.out.println(lhm);
	}
	//Add the data based on entries not in sequence
}

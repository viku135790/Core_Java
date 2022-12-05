package collection_interface;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.ArrayList;
import java.util.Collection;

public class Collection_add_Method {
	public static void main(String[] args) {
		//add object && addAll
		Collection c=new ArrayList();
		c.add(45);
		c.add(92);
		c.add("Anshul");
		c.add(true);
		c.add(48.93);
		c.add(950);
		
		Collection c1=new ArrayList();
		c1.add(45.36);
		c1.add("ankit");
		c1.addAll(c);
		c1.add(4568);
		
		System.out.println(c1);
	}

}

package collection_interface;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Iterator {
	public static void main(String[] args) {
		//iterator
		
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
		c1.add(4568);
		
		Collection c2=new ArrayList();
		c2.add(45.36);
		c2.add("vijay");
		c2.add(4568);
		
		Collection c3=new ArrayList();
		c3.add(45.36);
		c3.add("krishna");
		c3.addAll(c);
		c3.addAll(c2);
		c3.addAll(c1);
		c3.add(4568);
		
		System.out.println(c.iterator());
		
	}

}

package collection_interface;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.ArrayList;
import java.util.Collection;

public class Object_Boolean {
		public static void main(String[] args) {
			Collection c=new ArrayList();
			c.add(45);
			c.add(92);
			c.add("Anshul");
			c.add(true);
			c.add(48.93);
			c.add(950);
			
			Object o="true";
			//System.out.println(o+10); not possible
			//first way
			Boolean b=Boolean.valueOf(o.toString());
			System.out.println(b);
			
			//Second way
			
			String s=o.toString();
			
			Boolean bb=Boolean.parseBoolean(s);
			System.out.println(bb);
		
	}

}

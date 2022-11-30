package set;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */
import java.util.LinkedHashSet;

public class Linked_HashSet {
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(45);
		lhs.add(48);
		lhs.add(798);
		lhs.add(78);
		lhs.add(10);
		lhs.add(80);
		lhs.add(100);
		lhs.add(50);
		
		System.out.println(lhs);
		
		for(Object o:lhs) {
			System.out.println(o);
		}
		//stored according to insertion order
	}

}

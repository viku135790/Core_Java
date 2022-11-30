package set;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */
import java.util.HashSet;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(48);
		hs.add(798);
		hs.add(78);
		hs.add(10);
		hs.add(80);
		hs.add(100);
		hs.add(50);
		
		System.out.println(hs);
		
		for(Object o:hs) {
			System.out.println(o);
		}
		//Object Stored object Acoording to Hashcod 
	}

}

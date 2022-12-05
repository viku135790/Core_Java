package collection_list;

/*if anything wrong teh report on this link
 * https://www.linkedin.com/in/vikas-kumar-517994229/
 * */
import java.util.*;

public class Excercise {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(25);
		l.add(90);
		l.add(2, 45);
		l.add(1,"Ram");
		l.add(0, "Sita");
		
		System.out.println(l);
		
		List l1=new ArrayList();
		l1.add(60);
		
		//some imp method-----------------------------------
		l1.addAll(l);
		System.out.println(l1);
		System.out.println(l.indexOf(90));
		
		
		l.remove(2);
		System.out.println(l);
		
		System.out.println(l.size());
		
		
	}

}

package collection_arraylist;

/*if anything wrong teh report on this link
 * https://www.linkedin.com/in/vikas-kumar-517994229/
 * */

//we can store multiple duplicate values
import java.util.*;

public class Excercise1 {
	public static void main(String[] args) {
		//No arguments constructor
		ArrayList a=new ArrayList(); //deafult Size is 10;
		a.add(25);
		a.add("Ram");
		a.add(true);
		a.add(null);
		a.add(25);
		
		System.out.println(a);
		
		//fixed size arrayList
		ArrayList al=new ArrayList(15);
		
		//generic
		ArrayList<Integer> an=new ArrayList<Integer>();
		
		
		//Import collection
		Collection c=new ArrayList();
		c.add(10);
		c.add("ravi");
		c.add("Raghu");
		c.add(true);
		c.add(25);
		
		//to add all the collection object
		ArrayList nl=new ArrayList(c);
		System.out.println(nl);
	}
	

}

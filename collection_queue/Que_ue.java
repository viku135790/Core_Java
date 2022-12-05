package collection_queue;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

import java.util.*;

public class Que_ue {
	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		
		q.add(45);
		q.add(48);
		q.add(700);
		q.add(78);
		q.add(10);
		q.add(80);
		q.add(100);
		q.add(50);
		
		System.out.println("Old queue = "+q);
		//for display the first elements
		System.out.println(q.peek());
		//Access and remove
		System.out.println(q.poll());
		
		//New Queue
		System.out.println("New Queue = "+q);
		
	}
	//stored the Group of object based on fifo pattern
}

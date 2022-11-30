package opps_states_behaviour;
////desing browser class and object?

//States of a class defined the properties or behaviour about a class.
//The action performed by object is called behaviour.

import java.util.*;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */
public class Browser {
	//states
	String name;
	String version;
	String size;
	
	//behaviour
	public void search()
	{
		System.out.println("Search in the  browser");
	}
	public void download() {
		System.out.println("Download the file");
	}
}

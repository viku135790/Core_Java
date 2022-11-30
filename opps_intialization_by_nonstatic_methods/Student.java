package opps_intialization_by_nonstatic_methods;

/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Student {
	String name;
	int age;
	int rollnum;
	public void setValue(String n, int a, int r) {
		name=n;
		age=a;
		rollnum=r;
		
	}
	//for output
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollnum);
		
	}

}

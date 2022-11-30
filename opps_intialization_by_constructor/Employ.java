package opps_intialization_by_constructor;
/*if any program is wrong then report on (viku135790@gmail.com);
* Or u can mail your question (viku135790@gmail.com) */

public class Employ {
	String name;
	int age;
	int sal;
	
	Employ(){
		System.out.println("This is default constructor");
	}
	Employ(String n, int a, int s){
		name=n;
		age=a;
		sal=s;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
	}

}

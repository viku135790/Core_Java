package opps_polymorphism;

/*if anything wrong teh report on this link
 * https://www.linkedin.com/in/vikas-kumar-517994229/
 * */

public class AnimalDriver {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.sound();
		
		Animal a1=new Cow();
		a1.sound();
	}

}

package opps_abstraction;

/*if anything wrong teh report on this link
 * https://www.linkedin.com/in/vikas-kumar-517994229/
 * */

public abstract class Vehicle {
	
	public abstract void start();
	public abstract void drive();
	
	public void stop() {
		System.out.println("Stop the vehicle");
	}
	public void playMusic() {
		System.out.println("Play music in Vehicle");
	}

}

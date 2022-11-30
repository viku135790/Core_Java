package opps_abstraction;

/*if anything wrong teh report on this link
 * https://www.linkedin.com/in/vikas-kumar-517994229/
 * */

public class TeslaDriver {
	public static void main(String[] args) {
		Vehicle v=new Tesla();
		v.drive();
		v.playMusic();
		v.start();
		v.start();
		ElectricVehicle ev=new Tesla();
		ev.charge();
		ev.drive();
		ev.on();
		ev.playMusic();
		ev.start();
		ev.stop();
	}
}

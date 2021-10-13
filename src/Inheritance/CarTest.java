package Inheritance;

public class CarTest {
	public static void main(String[] args) {
		ArmoredCar ac=new ArmoredCar();
		ac.autoStart();
		ac.start();
		ac.canShoot();
		ac.canFloat();
		System.out.println("Artillery duration time= "+ac.duration);
		System.out.println("Canfloat duration time= "+ac.duration1);
		}
}


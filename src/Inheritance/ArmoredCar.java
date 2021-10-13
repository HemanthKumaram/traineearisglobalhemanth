package Inheritance;

public class ArmoredCar extends Car implements Artillery, Canfloat {
void autoStart()
{
	System.out.println("Automatically started");
}
public void canShoot()
{
	System.out.println("Can fly ");
}
public void canFloat()
{
	System.out.println("Can float on water ");
}
}

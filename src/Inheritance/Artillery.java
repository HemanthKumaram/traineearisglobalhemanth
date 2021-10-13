package Inheritance;

public interface Artillery {
int duration=20;
public void canShoot();
public default void repair()
{
	System.out.println("Repair of Artillery");
}
}

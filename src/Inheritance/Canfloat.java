package Inheritance;

public interface Canfloat extends Artillery {
	int duration1=20;
	public void canFloat();
	public default void repair2()
	{
		System.out.println("Repair of Float");
	}
}


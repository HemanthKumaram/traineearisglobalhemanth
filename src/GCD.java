import java.util.Scanner;
public class GCD {
public static void main(String[] args)
{
	int x,y,gcd=1;
	System.out.println("Enter which tables you want to print:");
	Scanner input = new Scanner(System.in);
	x = input.nextInt();
	y = input.nextInt();
	for(int i=1; i<=x&&i<=y;i++)
	{
		if(x%i==0&&y%i==0)
			gcd=i;
	}
	System.out.printf("GCD of %d and %d is: %d",x,y,gcd);
}
}

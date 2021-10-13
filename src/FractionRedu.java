import java.util.Scanner;

public class FractionRedu {
static void reduceFraction(int x, int y)
{
	int d;
	d= gcd(x,y);
	x=x/d;
	y=y/d;
	System.out.println("res=24 "+x +"/"+y);
}
static int gcd(int a, int b) {
	if(b==0)
		return a;
	return gcd(b,a%b);
}

public static void main(String[] args)
{
	System.out.println("enter num");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	reduceFraction(x,y);
}
}

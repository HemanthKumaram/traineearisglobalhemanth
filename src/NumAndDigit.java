import java.util.Scanner;
public class NumAndDigit {
static boolean isDigitPresent(int x, int d)
{
	while(x>0)
	{
		if(x%10 == d)
			break;
		x=x/10;
	}
	return(x>0);
}
static void printNumbers(int n, int d)
{
	for (int i=0; i<=n; i++)
		if(i==d|| isDigitPresent(i,d))
			System.out.print(i+" ");
}
public static void main(String[] args)
{
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("enter digit");
	Scanner s = new Scanner(System.in);
	int d = s.nextInt();
	printNumbers(n,d);
}
}

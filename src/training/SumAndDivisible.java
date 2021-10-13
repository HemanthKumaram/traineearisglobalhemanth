package training;
import java.util.Scanner;
public class SumAndDivisible {
static int sum(int n, int x, int y)
{
	int s1,s2,s3;
	
	s1=((n/x))*(2*x+(n/x-1)*x)/2;
	s2=((n/y))*(2*y+(n/y-1)*y)/2;
	s3=((n/(x*y)))*(2*(x*y)+(n/(x*y-1)*(x*y))/2);
	return s1+s2+s3;
	
}
/*
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("enter two digits by which we want to divisible the number");
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();
	System.out.println("result="+sum(n,x,y));
}*/
}

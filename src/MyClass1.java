import java.util.Scanner;
public class MyClass1 {

public static void main(String args[]) {
	int a,b,c, big=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter two number:");
	a= sc.nextInt();
	b= sc.nextInt();
	c= sc.nextInt();
	if(a>b)
	{
	if(a>c)
	{
		big=a;
	}
	}
	else if(b>c)
	{
	 if(b>a)
	{
		big=b;
	}
	}
	else
	{
		big=c;
	}
	
	System.out.print("Largest of Two Number is "+big);
}
}
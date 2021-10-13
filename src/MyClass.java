import java.util.Scanner;
public class MyClass {

public static void main(String args[]) {
	int a,b, big;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter two number:");
	a= sc.nextInt();
	b= sc.nextInt();
	if(a>b)
	{
		big=a;
	}else
	{
		big=b;
	}
	
	System.out.print("Largest of Two Number is "+big);
}
}
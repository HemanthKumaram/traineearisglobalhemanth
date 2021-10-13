import java.util.Scanner;
public class Programs {
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter 1st decimal value");
float x=s.nextFloat();
System.out.println("Enter 2nd decimal value");
float y=s.nextFloat();
float z = (x+y);

x = Math.round(x * 1000);
x = x / 1000;

y=Math.round(y * 1000);
y=y / 1000;

if(x==y)
{
System.out.println("They sum upto 3 decimal places");
}
else
{
System.out.println("They are different");
}
}
}
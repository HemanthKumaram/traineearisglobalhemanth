import java.util.Scanner;

public class Table {
public static void main(String[] args)
{
	int num;
	System.out.println("Enter which tables you want to print:");
	Scanner input = new Scanner(System.in);
	num = input.nextInt();
	for(int i=1; i<=10;++i)
	{
		System.out.printf("%d * %d= %d\n",num,i,num*i);
	}
}
}

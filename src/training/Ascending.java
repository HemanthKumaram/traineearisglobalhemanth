package training;
import java.util.*;
public class Ascending {
static boolean isCorrectOrder(int n)
{
	boolean flag=true;
	int prev=-1;
	int type=-1;
	
	while(n!=0) {
		if(type==-1)
		{
			if(prev==-1)
			{
				prev=n%10;
				n=n/10;
				continue;
			}
			if(prev==n%10)
			{
				flag=false;
				break;
			}
			if(prev>n%10)
			{
				type=1;
				prev=n%10;
				n=n/10;
				continue;
			}
			prev=n%10;
			n=n/10;
		}
		else
		{
		if(prev==n%10) {
			flag=false;
			break;
		}
		if(prev<n%10)
		{
			flag=false;
			break;
		}
		prev=n%10;
		n=n/10;
		}
	}
	return flag;
	
		
}
public static void main(String[] args) {
	System.out.println("enter the numbers");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	if(isCorrectOrder(n))
			System.out.println("yes");
		else
			System.out.print("No");
	
}
}

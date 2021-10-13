package training;
import java.util.*;
public class SumOfSquare {

private int sum ,squOfsumn;

public int diffrent(int n)
{
for(int i=1;i<=n;i++)
{
sum+=i;
}
sum = sum*sum;
for(int i=1;i<=n;i++)
{
squOfsumn =squOfsumn+(i*i);
}
return squOfsumn-sum;
}



public static void main(String[] args) {
// TODO Auto-generated method stub
SumOfSquare in = new SumOfSquare();
Scanner s = new Scanner(System.in);
System.out.println("enter the number");
int n = s.nextInt();
System.out.println(in.diffrent(n));



}



}

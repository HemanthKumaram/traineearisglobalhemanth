package training;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter two digits by which we want to divisible the number");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		SumAndDivisible cal=new SumAndDivisible();
		System.out.print("result="+SumAndDivisible.sum(n,x,y));
		//double sum=cal.add(4.7, 3.5); 
			}
}

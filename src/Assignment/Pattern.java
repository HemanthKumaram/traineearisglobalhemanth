package Assignment;

import java.util.Scanner;
public class Pattern {
		void show(int n)
		{
		for(int i = n; i>0;i--)
		{
		for(int j=1; j<=i;j++)
		{
		System.out.print(j);
		}
		System.out.println();
		}
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter a number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		Pattern ne = new Pattern();
		ne.show(n); }}



package diwali_assignment2;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      int sum = sumOdd(num);
	      System.out.println("Sum of first "+num+" odd numbers is: "+sum);
	}

	public static int sumOdd(int num) {
		int sum =0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		return sum;
   }
}


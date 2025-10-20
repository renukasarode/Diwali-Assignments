package diwali_assignment2;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      int sum = sumEven(num);
	      System.out.println("Sum of first "+num+" even numbers is: "+sum);
	}

	public static int sumEven(int num) {
		int sum =0;
		for(int i=2;i<=num;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		
		return sum;
	}

}

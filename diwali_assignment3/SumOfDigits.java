package diwali_assignment3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int num = sc.nextInt();
       int result = sumOfDigits(num);
       System.out.println("sum of digits of number "+num+" is --------> "+result);
	}

	public static int sumOfDigits(int num) {
		int sum =0;
		for(int i=num;i>0;i/=10)
		{
			sum+=i%10;
		}
		return sum;
	}

}

package diwali_assignment2;

import java.util.Scanner;

public class ReverseNumberTrimZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      int reverse = reverseNumber(num);
	      System.out.println("The reverse number of number "+num+" is :---"+reverse);      
	}

	public static int reverseNumber(int num) {
		int reverse =0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			reverse = reverse*10+rem;
		}
		return reverse;
	}

}

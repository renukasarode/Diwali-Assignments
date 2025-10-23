package diwali_assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num==1)
		{
			System.out.println("number is not prime nor composite");
		}
		else if(checkPrime(num))
		{
		  System.out.println("your entered number: "+num+" is prime");
		}
		else
		{
		  System.out.println("your entered number: "+num+" is not prime");
		}

	}
	public static boolean checkPrime(int num)
	{
		int i;
		for(i=2;i<=num/2;i++)
		{
		   if(num%i==0)
		   {
			 break;  
		   }
		}
		if(i>num/2)
		{
			return true;
		}
		return false;
	}
}

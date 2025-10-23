package diwali_assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      int result = factNum(num);
      System.out.println("Factorial of the number: "+num+" is "+result);
	}

	public static int factNum(int num) {
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}

}

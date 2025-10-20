package diwali_assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      System.out.println("FibonacciSeries upTo number "+num+" is :--");
	      generateFibbi(num);
	}

	public static void generateFibbi(int num) {
		int n1 = 0;
		int n2 =1;
		for(int i=0;i<num;i++)
		{
		  System.out.println(n1);
		  int sum = n1+n2;
		  n1=n2;
		  n2=sum;
		}
	}
}

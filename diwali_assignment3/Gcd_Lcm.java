package diwali_assignment3;

import java.util.Scanner;

public class Gcd_Lcm {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first number");
       int n1 = sc.nextInt();
       System.out.println("Enter the second number");
       int n2 = sc.nextInt();
       int gcd = calculateGcd(n1,n2);
       int lcm = calculateLcm(n1,n2);
       System.out.println("GCD Of entered numbers "+n1+" and "+n2+" is -----> "+gcd);
       System.out.println("LCM Of entered numbers "+n1+" and "+n2+" is -----> "+lcm);
	}

	public static int calculateLcm(int n1, int n2) {
		int max = n1>n2?n1:n2;
		int lcm =1;
		for(int i=max;i!=0;i++)
		{
			if(i%n1==0 && i%n2==0)
			{
				lcm = i;
				break;
			}
		}
		
		return lcm;
	}

	public static int calculateGcd(int n1, int n2) {
		int min = n1<n2?n1:n2;
		int gcd =1;
		for(int i=min;i>0;i--)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}

}

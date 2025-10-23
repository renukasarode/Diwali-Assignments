package diwali_assignment2;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      boolean status = isArmStrong(num);
	      if(status)
	      {
	    	  System.out.println("the given number "+num+" is ArmStromg");
	      }
	      else
	      {
	    	  System.out.println("the given number "+num+" is not ArmStromg"); 
	      }
	}

	public static boolean isArmStrong(int num) {
		int length = checkLength(num);
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			sum+=power(rem,length);
		}
		if(sum==num)
		{
			return true;
		}
		return false;
	}

	public static int power(int rem, int length) {
		int power =1;
		for(int i=0;i<length;i++)
		{
			power*=rem;
		}
		return power;
	}

	public static int checkLength(int num) {
		int cnt =0;
		for(int i=num;i>0;i/=10)
		{
			cnt++;
		}
		return cnt;
	}

}

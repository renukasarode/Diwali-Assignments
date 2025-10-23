package diwali_assignment2;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      boolean status = isPalindrom(num);
	      if(status)
	      {
	    	  System.out.println("number "+num+" is palindrom");
	      }
	      else
	      {
	    	  System.out.println("number "+num+" is not palindrom");  
	      }
	}

	public static boolean isPalindrom(int num) {
		int reverse =0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			reverse = reverse*10+rem;
		}
		if(reverse == num)
		{
			return true;
		}
		return false;
	}

}

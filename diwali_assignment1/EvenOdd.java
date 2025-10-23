package diwali_assignment1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int num = sc.nextInt();
	      if(isEven(num))
	      {
	    	 System.out.println("number "+num+" is even"); 
	      }
	      else
	      {
	    	  System.out.println("number "+num+" is odd");  
	      }
	}

	public static boolean isEven(int num) {
		if(num%2==0)
		{
			return true;
		}
		return false;
	}

}

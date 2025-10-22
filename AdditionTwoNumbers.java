package diwali_assignment3;

import java.util.Scanner;

public class AdditionTwoNumbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = sc.nextInt();
        System.out.println("enter the Second number");
        int n2 = sc.nextInt();
        int result = addition(n1,n2);
        System.out.println("Addition of numbers is : "+result);
        
	}

	public static int addition(int n1, int n2) {
		return n1+n2;
	}

}

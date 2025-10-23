package diwali_assignment3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     int n = sc.nextInt();
     printTable(n);
     }

	public static void printTable(int n) {
        for(int i=1;i<=10;i++)	
        {
        	System.out.println(n+" * "+i+" = "+n*i);
        }
	}

}

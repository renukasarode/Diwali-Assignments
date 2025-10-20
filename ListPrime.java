package diwali_assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPrime {
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		listPrime(num);
		System.out.println(list);
	}

	public static void listPrime(int num) {
	
	  for(int i=2;i<=num;i++ )
	  {
		int j;
		for(j=2;j<=i/2;j++)
		{
		   if(i%j==0)
		   {
			 break;  
		   }
		}
		if(j>i/2)
		{
		  list.add(i);
		}
	}
  }
}

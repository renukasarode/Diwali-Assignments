package diwali_assignment3;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number of rows");
         int r = sc.nextInt();
         for(int i=0;i<r;i++)
         {
        	 int j;
        	 for(j=0;j<2*r;j++)
        	 {
        		 if(j>=r-1-i && j<=r-1+i)
        		 {
        			 System.out.print("*"+" ");
        		 }
        		 else
        		 {
        			 System.out.print(" "+" ");
        		 }
        	 }
        	 System.out.println();
         }
         
	}

}

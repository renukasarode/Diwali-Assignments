package diwali_assignment6;

import java.util.Scanner;

public class AlphanumericCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
//     String str = "ererABRT1245";
     boolean status = isAlphaNumeric(str);
     if(status)
     {
    	 System.out.println("The given String is Alphanumeric");
     }
     else
     {
    	 System.out.println("The given String is Not Alphanumeric"); 
     }
	}

	public static boolean isAlphaNumeric(String str) {
		for(int i=0;i<str.length();i++)
	     {
	    	 char t = str.charAt(i);
	    	 if(!((t >= 48 && t <= 57) || (t >= 65 && t <= 90) || (t >= 97 && t <= 122)))
	          {
	        	 return false; 
	          }
	     }
		return true;
	}

}

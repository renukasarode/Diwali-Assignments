package diwali_assignment5.study;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try {
		
     System.out.println("enter the value of num1");
     int n1 = sc.nextInt();
     System.out.println("Enter the value of num2");
     int n2 = sc.nextInt();
     System.out.println("Enter the operator (+, -, *, /, %) which operation you want to perform------>");
     String operator = sc.next();
     int result = calculate(n1,n2,operator);
     System.out.println("Result: " + result);
	}
	
	 catch (WrongOperatorException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    } finally {
        sc.close();
    }
	}
     
	public static int calculate (int n1, int n2, String operator)throws WrongOperatorException
	{
		switch(operator)
	     {
	     case "+"->{
	    	 return n1+n2;
	     }
	     case "-"->{
	    	return n1-n2; 
	     }
	     case "*"->{
	    	 return n1*n2;
	     }
	     case "/"->{
	    	if(n2==0)
	    	throw new ArithmeticException("Division by zero is not allowed");
	    	return n1/n2;
	     }
	     case "%"->{
	    	 if(n2==0)
	 	    	throw new ArithmeticException("Modulo by zero is not allowed");
	 	    	return n1%n2;
	     }
	    
		default->{
			throw new WrongOperatorException("Invalid Operator "+operator);
			
		}
	    }
  }
}

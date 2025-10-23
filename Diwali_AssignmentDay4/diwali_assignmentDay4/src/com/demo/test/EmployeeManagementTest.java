package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImple;

public class EmployeeManagementTest {

	public static void main(String[] args) {
	  EmployeeService eSer = new EmployeeServiceImple();
      Scanner sc = new Scanner(System.in);
      int choice =0;
      do 
      {
    	  System.out.println("Enter your choice");
    	  System.out.println("1. Add Employee to list\r\n"
    	  		+ "2. Show all Employee\r\n"
    	  		+ "3. Remove Employee list\r\n"
    	  		+ "4. Show all Employee in sorted order\r\n"
    	  		+ "5. Find a Employee with empName\r\n"
    	  		+ "6. Save all Employees into file\r\n"
    	  		+ "7. Quit");
    	  choice = sc.nextInt();
    	  switch(choice)
    	  {
    	  case 1->{
    		  boolean status = eSer.addEmployee();
    		  if(status)
    		  {
    			  System.out.println("employee Added successfully!!!");
    		  }
    		  else
    		  {
    			  System.out.println("employee not added");  
    		  }
    	  }
    	  case 2->{
    		  List<Employee> list = eSer.showAllEmployee();
    		  if(list!=null && !list.isEmpty())
    		  {
    			  list.forEach(System.out::println);
    		  }
    		  else
    		  {
    			  System.out.println("no employee added");
    		  }
    	  }
    	  case 3->{
    		  boolean status = eSer.RemoveAll();
    		  if(status)
    		  {
    			  System.out.println("employees deleted successfully");
    		  }
    		  else
    		  {
    			  System.out.println("not deleted");  
    		  }
    	  }
    	  case 4->{
    		  boolean status = eSer.SortByEid();
    		  if(status)
    		  {
    			  System.out.println("employees sorted");
    		  }
    		  else
    		  {
    			  System.out.println("no employee for sorting");  
    		  }
    	  }
    	  case 5->{
    		  System.out.println("Enter the name of the Employee");
    		  String name = sc.next();
    		  List<Employee> list = eSer.FindEmployeeByName(name);
    		  if(list!=null && !list.isEmpty())
    		  {
    			  list.forEach(System.out::println);
    		  }
    		  else
    		  {
    			  System.out.println("no employee found");
    		  }
    	  }
    	  case 6->{
    		  boolean status = eSer.saveInFile();
    		  if(status)
    		  {
    			  System.out.println("All employees saved to 'employees.dat' successfully!");
    		  }
    		  else
    		  {
    			  System.out.println("Error saving employees: ");  
    		  }
    	  }
    	  case 7->{
    		  sc.close();
    		  System.out.println("thank you for visiting!!!!");
    	  }
    	  default->{
    		  System.out.println("Please Enter the correct choice");
    	  }
    	  }
    	  
      }
      while(choice!=7);
	}

}

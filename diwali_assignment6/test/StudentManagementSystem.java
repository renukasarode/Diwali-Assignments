package diwali_assignment6.test;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import diwali_assignment6.beans.Student;
import diwali_assignment6.exception.LowAttendanceException;
import diwali_assignment6.service.StudentService;
import diwali_assignment6.service.StudentServiceImple;

public class StudentManagementSystem {

	public static void main(String[] args) {
		StudentService sSer = new StudentServiceImple();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=0;
		do {
			System.out.println("1.add the student/ Sort the Students in Decresing order of the Attendence_Percentage\n"
					+ "2. Display The Students\n"
					+ "3. Store students in file using serialization\n"
					+ "4. Display the file StudentData");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1->{
			   boolean status = sSer.addStudent();
			   if(status)
			   {
				   System.out.println("Student added successfully!!!");
			   }
			   else
			   {
				   System.out.println("Student not added");  
			   }
			}
			case 2->{
				   Set<Student> sSet = sSer.displayStudent();
				   if (sSet != null && !sSet.isEmpty()) {
					    sSet.forEach(student -> {
					        System.out.println(student); 
					        try {
					            String grade = student.calulateGrade();
					            System.out.println("Grade of the Student is: " + grade);
					        } catch (LowAttendanceException e) {
					            System.out.println(e.getMessage());
					        }
					        System.out.println(); 
					    });
					} else {
					    System.out.println("No Student Added");
					}
				}
			case 3->{
				try {
					boolean status = sSer.addStudentsFile();
					if (status) {
			            System.out.println("Students saved successfully!");
			        }
				} catch (IOException e) {
					System.out.println(e.getMessage());;
				}
			
				}
			
			case 4->{
				try {
					Set<Student> sSet = sSer.ReadStudentFromFile();
					System.out.println("Students loaded successfully!");

				    for (Student student : sSet) {
				        System.out.println(student);
				        try {
				            System.out.println("Grade: " + student.calulateGrade());
				        } catch (LowAttendanceException e) {
				            System.out.println("Grade: Not eligible" + e.getMessage());
				        }
				        System.out.println();
				}
				}catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				}
			
			case 5->{
				  sc.close();
				  System.out.println("Thank you for visiting");
				}
			
			default->{
				System.out.println("Please Enter the correct choice");
			}
			}
			
		}
		while(choice!=4);
		

	}

}

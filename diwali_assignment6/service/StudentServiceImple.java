package diwali_assignment6.service;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import diwali_assignment6.beans.Student;
import diwali_assignment6.dao.StudentDao;
import diwali_assignment6.dao.StudentDaoImple;

public class StudentServiceImple implements StudentService {
	StudentDao sDao=null;
	public StudentServiceImple()
	{
		sDao = new StudentDaoImple();
	}

	@Override
	public boolean addStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the rollNo of the Student");
		int rollNo = sc.nextInt();
		System.out.println("enter the name of the Student");
		String name = sc.next();
		System.out.println("enter the course of the Student");
		String course = sc.next();
		System.out.println("enter the attendencePercentage of the Student");
		double attenPer = sc.nextDouble();
		System.out.println("enter the course of the Student");
		double score = sc.nextDouble();
		Student std = new Student(rollNo,name,course,attenPer,score);
		
		return sDao.addStudent(std);
	}

	@Override
	public Set<Student> displayStudent() {
		return sDao.displayStudents();
	}

	@Override
	public boolean addStudentsFile()throws IOException {
		return sDao.addStudentsFile();
	}

	@Override
	public Set<Student> ReadStudentFromFile() throws IOException, ClassNotFoundException{
		return sDao.readStudentsFromFile();
	}
}

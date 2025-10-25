package diwali_assignment6.service;

import java.io.IOException;
import java.util.Set;

import diwali_assignment6.beans.Student;

public interface StudentService {

	boolean addStudent();

	Set<Student> displayStudent();

	boolean addStudentsFile()throws IOException;

	Set<Student> ReadStudentFromFile() throws IOException, ClassNotFoundException;

}

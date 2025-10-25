package diwali_assignment6.dao;

import java.io.IOException;
import java.util.Set;

import diwali_assignment6.beans.Student;

public interface StudentDao {

	boolean addStudent(Student std);

	Set<Student> displayStudents();

	boolean addStudentsFile() throws IOException;

	Set<Student> readStudentsFromFile() throws IOException, ClassNotFoundException;

}

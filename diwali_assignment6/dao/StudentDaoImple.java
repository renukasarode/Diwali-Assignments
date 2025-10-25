package diwali_assignment6.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import diwali_assignment6.beans.Student;

public class StudentDaoImple implements StudentDao {
	
	static Comparator<Student> studentComparator = (Comparator<Student> & java.io.Serializable) (s1, s2) -> {
	    int cmp = Double.compare(s2.getAttedPerc(), s1.getAttedPerc());
	    if (cmp == 0) return Integer.compare(s1.getRollNo(), s2.getRollNo());
	    return cmp;
	};
	
	static Set<Student> sSet = new TreeSet<Student>(studentComparator);
	
	static {
		
		sSet.add(new Student(1, "Aarav", "Java", 95, 88));
		sSet.add(new Student(2, "Riya", "Java", 80, 92));
		sSet.add(new Student(3, "Neha", "Python", 55, 78)); 
		sSet.add(new Student(4, "Rohit", "C++", 70, 85));
		sSet.add(new Student(5, "Simran", "Java", 99, 93));
		sSet.add(new Student(6, "Ankit", "Python", 62, 67));
		sSet.add(new Student(7, "priya", "C#", 89, 74));
		sSet.add(new Student(8, "Tejal", "Java", 45, 81)); 
        sSet.add(new Student(9, "Sneha", "C", 77, 69));
        sSet.add(new Student(10, "Dev", "C++", 85, 95));
	}

	@Override
	public boolean addStudent(Student std) {
		if(std!=null)
		return sSet.add(std);
		return false;
	}

	@Override
	public Set<Student> displayStudents() {
		return sSet;
	}

	@Override
	public boolean addStudentsFile() throws IOException{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Sujay\\Desktop\\Diwali Assignments\\diwali_assignments\\src\\diwali_assignment6\\students.dat"))) {
	        oos.writeObject(sSet);  
	        return true;
	    } catch (IOException e) {
	    	
	        throw new IOException("Error saving students to file 'students.dat'...",e);
	    }
}

	@Override
	public Set<Student> readStudentsFromFile() throws IOException,ClassNotFoundException{
		 try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Sujay\\\\Desktop\\\\Diwali Assignments\\\\diwali_assignments\\\\src\\\\diwali_assignment6\\\\students.dat"))) {
		        
		        Set<Student> sSet = (Set<Student>) ois.readObject();
		        System.out.println("✅ Students loaded successfully from file!");
		        return sSet;

		    } catch (IOException e) {
		    	throw new IOException("Error reading students file. Please make sure the file exists and is accessible.");
		    } catch (ClassNotFoundException e) {
		        throw new ClassNotFoundException(" Error reading students: Student class not found.");
		    }
	}
}

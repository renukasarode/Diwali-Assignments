package diwali_assignment6.beans;

import java.io.Serializable;

import diwali_assignment6.exception.LowAttendanceException;

public class Student implements Serializable {
	
//private static final long serialVersionUID = 1L;

private int rollNo;
private String name;
private String course;
private double attedPerc;
private double score;

public Student() {
	super();
}

public Student(int rollNo, String name, String course, double attedPerc, double score) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.course = course;
	this.attedPerc = attedPerc;
	this.score = score;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public double getAttedPerc() {
	return attedPerc;
}

public void setAttedPerc(double attedPerc) {
	this.attedPerc = attedPerc;
}

public double getScore() {
	return score;
}

public void setScore(double score) {
	this.score = score;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", attedPerc=" + attedPerc + ", score="
			+ score + "]";
}

public String calulateGrade() throws LowAttendanceException
{
	if(attedPerc<60)
	{
		throw new LowAttendanceException("Attendence below 60% not allow for grading");
	}
	if (score >= 90) return "A+";
    else if (score >= 80) return "A";
    else if (score >= 70) return "B";
    else if (score >= 60) return "C";
    else return "D";
}

 
}

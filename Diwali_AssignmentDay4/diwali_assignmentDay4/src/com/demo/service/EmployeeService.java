package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	List<Employee> showAllEmployee();

	boolean RemoveAll();

	boolean SortByEid();

	List<Employee> FindEmployeeByName(String name);

	boolean saveInFile();

}

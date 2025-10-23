package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean saveEmployee(Employee emp);

	List<Employee> displayAll();

	boolean removeAll();

	boolean sortById();

	List<Employee> findEmpByName(String name);

	boolean SaveInFile();

}

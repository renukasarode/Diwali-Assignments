package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImple;

public class EmployeeServiceImple implements EmployeeService{
	EmployeeDao eDao=null;
	public EmployeeServiceImple()
	{
		eDao = new EmployeeDaoImple();
	}

	@Override
	public boolean addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id of the employee");
		int id = sc.nextInt();
		System.out.println("enter the name of the employee");
		String name = sc.next();
		System.out.println("enter the role of the Employee");
		String role = sc.next();
		Employee emp = new Employee(id,name,role);
		
		return eDao.saveEmployee(emp);
	}

	@Override
	public List<Employee> showAllEmployee() {
		return eDao.displayAll();
	}

	@Override
	public boolean RemoveAll() {
		return eDao.removeAll();
	}

	@Override
	public boolean SortByEid() {
		return eDao.sortById();
	}

	@Override
	public List<Employee> FindEmployeeByName(String name) {
		return eDao.findEmpByName(name);
	}

	@Override
	public boolean saveInFile() {
		return eDao.SaveInFile();
	}

}

package com.demo.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImple implements EmployeeDao {
	static List<Employee> list = new ArrayList<>();
	static {
		list.add(new Employee(1,"teja","java developer"));
		list.add(new Employee(2,"renu","java developer"));
		list.add(new Employee(3,"kaju","c developer"));
	}

	@Override
	public boolean saveEmployee(Employee emp) {
		if(emp!=null)
		{
			list.add(emp);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> displayAll() {
		return list;
	}

	@Override
	public boolean removeAll() {
		return list.removeAll(list);
	}

	@Override
	public boolean sortById() {
		if(!list.isEmpty())
		{
		 list.sort(null);
		 return true;
		}
		return false;
	}

	@Override
	public List<Employee> findEmpByName(String name) {
		List<Employee> eList = new ArrayList<Employee>();
		for(Employee e:list)
		{
			if(e.getEmpName().equals(name))
			{
				eList.add(e);
			}
		}
		return eList;
	}

	@Override
	public boolean SaveInFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
	        oos.writeObject(list);
	        return true;
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	        return false;
	    }
	}

}

package com.flp.ems.service;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Roles;
import com.flp.ems.domain.project;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
public class EmployeeServiceImpl implements IEmployeeService
	{
	static HashSet<String> h = new HashSet<String>();
	public void AddEmployee(HashMap<Integer,Object> hmap) throws ClassNotFoundException, SQLException 
	{
	//DUPLICATE AND UNIQUE CHECK
	if(h.contains((String)hmap.get(2)) || h.contains((String)hmap.get(3)))
	{
	System.out.println("DUPLICATE EMAIL ID OR EMPLOYMENT ID EXISTS");
	System.out.println("EMPLOYEE OBJECT HAS NOT BEEN CREATED");
	return;
	}
	h.add((String)hmap.get(2));
	h.add((String)hmap.get(3));
	//SETTER AND GETTER METHOD
	Employee employee=new Employee();
	employee.setName((String) hmap.get(1));
	employee.setEmployeeid((String) hmap.get(2));
	employee.setEmail_id((String) hmap.get(3));
	employee.setPhoneno((String)hmap.get(4));
	employee.setDob((String) hmap.get(5));
	employee.setDoj((String) hmap.get(6));
	employee.setAdress((String) hmap.get(7));
	employee.setProject_id((String) hmap.get(8));
	employee.setDepartment_id((String) hmap.get(9));
	employee.setRoles_id((String)hmap.get(10));
	EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
	empld.AddEmployee(employee);
	}
	
	public void ModifyEmployee(HashMap<Integer,Object> hmap,boolean[] flag, String id) throws ClassNotFoundException, SQLException
	{
		Employee employee=new Employee();
		employee.setName((String) hmap.get(1));
		employee.setEmployeeid((String) hmap.get(2));
		employee.setEmail_id((String) hmap.get(3));
		employee.setPhoneno((String)hmap.get(4));
		employee.setDob((String) hmap.get(5));
		employee.setDoj((String) hmap.get(6));
		employee.setAdress((String) hmap.get(7));
		employee.setProject_id((String) hmap.get(8));
		employee.setDepartment_id((String) hmap.get(9));
		employee.setRoles_id((String)hmap.get(10));
		//String s=(String) hmap.get(2);
		//p=s;
		/*if(h.contains((String)hmap.get(2)))
		{
			System.out.println("in service layer");
		EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
		
		}
		else
		System.out.println("EMPLOYEE ID IS NOT THERE");*/
		EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
		empld.ModifyEmployee(employee,flag,id);
	}

	//REMOVE EMPLOYEE
	public void RemoveEmployee(String id)throws ClassNotFoundException, SQLException 
	{
		//System.out.println("in service layer id ="+id);
		EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
		empld.RemoveEmployee(id);
		System.out.println("in service layer");
	}

	//SEARCH EMPLOYEE
	public void SearchEmployee(String s)throws ClassNotFoundException, SQLException 
	{
		EmployeeDaoImplForList emplde = new EmployeeDaoImplForList();
		emplde.SearchEmployee(s);
	}

	//GET ALL EMPLOYEE DETAILS
	public void GetallEmployee() throws ClassNotFoundException, SQLException{
		EmployeeDaoImplForList empl = new EmployeeDaoImplForList();
		empl.GetallEmployee();
		
	}

}

package com.flp.ems.dao;

import java.sql.SQLException;
import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IemployeeDao 
{
	 public void AddEmployee(Employee e) throws ClassNotFoundException,SQLException;
	 public void ModifyEmployee(Employee e,boolean[] flag, String id)throws ClassNotFoundException, SQLException;
	 public void RemoveEmployee(String id)throws ClassNotFoundException, SQLException;
	 public void SearchEmployee(String s)throws ClassNotFoundException, SQLException;
	 public void GetallEmployee()throws ClassNotFoundException,SQLException;

}

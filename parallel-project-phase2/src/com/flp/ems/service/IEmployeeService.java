package com.flp.ems.service;

import java.sql.SQLException;
import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	public void AddEmployee(HashMap<Integer, Object> hmap)throws ClassNotFoundException, SQLException;
	public void ModifyEmployee(HashMap<Integer, Object> map,boolean flag[], String id)throws ClassNotFoundException, SQLException;
	public void RemoveEmployee(String id)throws ClassNotFoundException, SQLException;
	public void SearchEmployee(String s)throws ClassNotFoundException, SQLException;
	public void GetallEmployee()throws ClassNotFoundException, SQLException;

}

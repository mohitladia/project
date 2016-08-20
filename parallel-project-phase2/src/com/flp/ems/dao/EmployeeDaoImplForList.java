package com.flp.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Roles;
import com.flp.ems.domain.project;

public  class EmployeeDaoImplForList implements IemployeeDao 
{
	public void AddEmployee(Employee e ) throws ClassNotFoundException, SQLException 
	{	
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		PreparedStatement ps=connection.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,e.getName());
		ps.setString(2, e.getEmployeeid());
		ps.setString(3, e.getEmail_id());
		ps.setString(4, e.getPhoneno());
		ps.setString(5, e.getDob());
		ps.setString(6, e.getDoj());
		ps.setString(7, e.getAdress());
		ps.setString(8, e.getDepartment_id());
		ps.setString(9, e.getProject_id());
		ps.setString(10, e.getRoles_id());
		int w=ps.executeUpdate();
		if(w==1)
		System.out.println("EMPLOYEE ADDED SUCCESFULLY!!!");
	}		
	public void ModifyEmployee(Employee e,boolean flag[],String id) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		PreparedStatement ps;
		if(flag[1]==true)
		{	
			ps=connection.prepareStatement("update employee set name =? where employeeid =?");
			ps.setString(1, e.getName());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[2]==true)				
		{	ps=connection.prepareStatement("update employee set email =? where employeeid =?");		
			ps.setString(1, e.getEmail_id());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[3]==true)
		{	ps=connection.prepareStatement("update employee set phone =? where employeeid =?");
			ps.setString(1, e.getPhoneno());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[4]==true)
		{	ps=connection.prepareStatement("update employee set address =? where employeeid =?");
			ps.setString(1, e.getAdress());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[5]==true)
		{	ps=connection.prepareStatement("update employee set dob =? where employeeid =?");
			ps.setString(1, e.getDob());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[6]==true)
		{	
			ps=connection.prepareStatement("update employee set doj =? where employeeid =?");
			ps.setString(1, e.getDoj());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[7]==true)
		{	ps=connection.prepareStatement("update employee set project_id =? where employeeid =?");
			ps.setString(1, e.getProject_id());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[8]==true)
		{	ps=connection.prepareStatement("update employee set department_id =? where employeeid =?");
			ps.setString(1, e.getDepartment_id());
			ps.setString(2, id);
			ps.executeUpdate();
		}
		if(flag[9]==true)
		{	
			ps=connection.prepareStatement("update employee set role_id =? where employeeid =?");
			ps.setString(1, e.getRoles_id());
			ps.setString(2, id);
			ps.executeUpdate();
		}}
	public void RemoveEmployee(String id)throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		System.out.println("DO YOU WANT TO REMOVE(Y/N)");
		Scanner scanner=new Scanner(System.in);
		String option = scanner.next();
		if(option.equals("Y"))
		{
			PreparedStatement as=connection.prepareStatement("delete from employee where employeeid = ?");
			as.setString(1, id);
			as.executeUpdate();
			System.out.println("EMPLOYEE HAS BEEN REMOVED SUCCESFULLY!!!");
		}
		
	}
	


	public void SearchEmployee(String s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		PreparedStatement qs=connection.prepareStatement("select * from employee where name = ? or email = ? or employeeid = ?");
		qs.setString(1, s);
		qs.setString(2, s);
		qs.setString(3, s);
		ResultSet rs=qs.executeQuery();  
		while(rs.next())
		{
			System.out.println("NAME OF EMPLOYEE: "  +  rs.getString(1)  +   "EMPLOYEE ID :  "+  rs.getString(2)  +   "EMAIL_ID:"+rs.getString(3)  +
					" PHONE NO:"  +  rs.getString(4)  +  "DATE OF BIRTH:"  +  rs.getString(5)  +  "DATE OF JOINING:"  +  rs.getString(6)  +    "ADDRESS: "  +  rs.getString(7)  +  "PROJECT_ID: "  +   rs.getString(8)  +  "DEPARTMENT_ID:"  +  rs.getString(9)  +  "ROLES_ID :"   +  rs.getString(10));
		}
		}
	
		
	
	public void GetallEmployee() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		PreparedStatement qs=connection.prepareStatement("select * from employee");
		ResultSet rs=qs.executeQuery();  
		while(rs.next()){  
			System.out.println("NAME OF EMPLOYEE: "+rs.getString(1)+"EMPLOYEE ID :"+rs.getString(2)+"EMAIL_ID:5 "+rs.getString(3)+
					"PHONE NO:"+rs.getString(4)+"DATE OF BIRTH:"+rs.getString(5)+"DATE OF JOINING:"+rs.getString(6)+"ADDRESS: "+rs.getString(7)+"PROJECT_ID: "+rs.getString(8)+"DEPARTMENT_ID:"+rs.getString(9)+"ROLES_ID :"+rs.getString(10));
		}
	}}

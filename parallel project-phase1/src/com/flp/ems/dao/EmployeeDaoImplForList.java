package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

public  class EmployeeDaoImplForList implements IemployeeDao {

	
	static ArrayList<Employee> al=new ArrayList<Employee>();
	public void AddEmployee(Employee e) 
	{
	al.add(e);
	System.out.println("EMPLOYEE HAS BEEN ADDED SUCCESFULLY!!!");
	}
	public void ModifyEmployee(Employee emp,boolean flag[]) 
	{
		
		Employee em=null;
		Employee temp=null;
		//String id =((String)hmap.get(2));
		for(Employee e : al) 
		{
			if(emp.getEmployeeid().equals(e.getEmployeeid()))
			{
				temp=e;
				em=e;
			}
		}
		al.remove(temp);
		if(flag[1]==true)
		{
			em.setName(emp.getName());
		}
		if(flag[2]==true)				
		{			
			em.setEmail_id(emp.getEmail_id());
		}
		if(flag[3]==true)
		{
			em.setPhoneno(emp.getPhoneno());
		}
		if(flag[4]==true)
		{
			em.setAdress(emp.getAdress());
		}
		if(flag[5]==true)
		{
			em.setDob(emp.getDob());
		}
		if(flag[6]==true)
		{
			em.setDoj(emp.getDoj());
		}
		if(flag[7]==true)
		{
			em.setProject_id(emp.getProject_id());
		}
		if(flag[8]==true)
		{
			em.setDepartment_id(emp.getDepartment_id());
		}
		if(flag[9]==true)
		{
			em.setRoles_id(emp.getRoles_id());		
		}
		al.add(em);
	}
	
	
	public void RemoveEmployee(String id) 
	{
		
		System.out.println("DO YOU WANT TO REMOVE(Y/N)");
		Scanner scanner=new Scanner(System.in);
		String option = scanner.next();
		if(option.equals("Y"))
		{
			Iterator<Employee> it = al.iterator();
			while (it.hasNext()) 
				{
					Employee user = it.next();
						if (user.getEmployeeid().equals(id)) 
							{
								it.remove();
								System.out.println("EMPLOYEE HAS BEEN REMOVED SUCCESFULLY!!!");
							}
								
							
						//System.out.println("EMPLOYEE HAS BEEN REMOVED SUCCESFULLY!!!");
				}
		}
	}
	


	public void SearchEmployee(String s) 
	{
		for(Employee e : al) 
			{
				String temp1 = e.getEmail_id();
				String temp2 = e.getEmployeeid();
				String temp3 = e.getName();
				if( temp1.equals(s) ||temp2.equals(s)||temp3.equals(s))
					{
						System.out.println(" SEARCHED EMPLOYEE DETAILS ="+ e);
		            }
			
				System.out.println("NO SUCH EMPLOYEE IS THERE!!!!");
			}
	}
	public void GetallEmployee() 
	{
		for (Employee a : al) 
			{
			System.out.println("ALL EMPLOYEE DETAILS = " + a);
			}
	}
	
	
}

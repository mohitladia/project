package com.flp.ems.view;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class Userinteraction 
{	
static HashMap <Integer,Object>hashMap = new HashMap();
		public void AddEmployee() throws ClassNotFoundException, SQLException
		{	
		// 1.EMPLOYEE NAME
		System.out.println("ENTER THE NAME OF EMPLOYEE ");
		Scanner scanner= new Scanner(System.in);
		String name=scanner.next();
		if(!Validate.is_name_valid(name))
		{
		System.out.println("INVALID NAME..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(1, name);
		scanner.nextLine();
		 // 2.EMPLOYEE ID
		System.out.println("ENTER YOUR EMPLOYMENT ID");
		String id = scanner.next();
		if(!Validate.is_employe_id_valid(id))
		{
		System.out.println("INVALID EMPLOYMENT ID..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(2,id);
	
		//3.EMPLOYEE EMAIL ID
		System.out.println("ENTER YOUR EMAIL ADRESS");
		String email_id=scanner.next();
		if(!Validate.is_email_valid(email_id))
		{
		System.out.println("INVALID EMAIL ID..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(3,email_id);
		
		
		
		//4.PHONE NO
		System.out.println("ENTER YOUR PHONE NO");
		String phoneNo=scanner.next();
		if(!Validate.validatePhoneNumber(phoneNo))
		{
		System.out.println("INVALID PHONE NO..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(4,phoneNo);
		
		
		//5.DATE OF BIRTH
		System.out.println("ENTER YOUR DATE OF BIRTH IN DD/MM/YYYY FORMAT");
		String dob = scanner.next();
		if(!Validate.is_dob_valid(dob))
		{
		System.out.println("INVALID DOB..PLEASE TRY AGAIN.....");
		return;
		}
		else
		hashMap.put(5, dob);
		
		
		
		//6.DATE OF JOINING
		System.out.println("ENTER YOUR DATE OF JOINING IN DD/MM/YYYY  FORMAT");
		String doj = scanner.next(); 
		if(!Validate.is_doj_valid(doj))
		{
		System.out.println("INVALID DOJ..PLEASE TRY AGAIN.....");
		return;
		}
		else
		hashMap.put(6, doj);
		
		  
		
		// 7.ADDRESS
		System.out.println("ENTER THE ADRESS");
		String adress=scanner.next();
		if(!Validate.is_adress_valid(adress))
		{
		System.out.println("INVALID ADRESS..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(7, adress);
		
		scanner.nextLine();
		
		//8.PROJECT ID
		System.out.println("PROJECT NAME AND DETAILS!!!!");
		System.out.println("ID: 4578 , NAME :EMS ,DECSRIPTION : EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("ID: 4579 , NAME :SMS ,DESCRIPTION : STUDENT MANAGEMENT SYSTEM");
		System.out.println("ENTER THE PROJECT ID");
		String project_id=scanner.next();
		if(!Validate.is_projectid_valid(project_id))
		{
		System.out.println("INVALID PROJECT_ID..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(8, project_id);
		
		
		
		//9.DEPARTMENT ID
		System.out.println("DEPARTMENT NAME AND DETAILS !!!!!   ");
		System.out.println(" ID: 126 , NAME : JAVA ,DECRIPTION : JAVA DEVELOPER");
		System.out.println(" ID: 127  ,NAME : MAINFRAME , DESCRIPTION : COBOL LANGUAGE");
		System.out.println("ENTER THE DEPARTEMNT ID");
		String department_id=scanner.next();
		if(!Validate.is_department_id_valid(department_id))
		{
		System.out.println("INVALID DEPARTMENT ID..PLEASE TRY AGAIN");
		return;
		}
		else
		hashMap.put(9, department_id);
					 
		//10.ROLES ID
		System.out.println("ROLES NAME AND DETAILS !!!!! ");
		System.out.println(" ID: 123 , NAME : DEVELOPER ,DECRIPTION : JAVA DEVELOPER");
		System.out.println(" ID: 124  ,NAME : TESTING , DESCRIPTION : TEST CASES");
		System.out.println("ENTER THE ROLES ID");
		String roles_id=scanner.next();
		if(!Validate.is_roles_id_valid(roles_id))
		{
		System.out.println("INVALID ROLES_ID..PLEASE TRY AGAIN");
		return;
		}
		else
		{
		hashMap.put(10,roles_id);
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		empl.AddEmployee(hashMap);
		}}
			
		
	
		
		
		
	//MODIFY EMPLOYEE	
	public void ModifyEmployee()throws ClassNotFoundException, SQLException
	{	int x=1;
		while(x==1){
		System.out.println("Enter your employment id");
		Scanner scanner= new Scanner(System.in);
		String id = scanner.next();
		if(Validate.is_employe_id_valid(id));
		System.out.println("1--------MODIFY NAME OF EMPLOYEE");
		System.out.println("2--------MODIFY EMAIL_ID");
		System.out.println("3--------MODIFY PHONE NO");
		System.out.println("4--------MODIFY ADRESS");
		System.out.println("5--------MODIFY DATE OF BIRTH ");
		System.out.println("6--------MODIFY DATE OF JOINING");
		System.out.println("7--------MODIFY PROJECT ID");
		System.out.println("8------- MODIFY DEPARTMENT_ID");
		System.out.println("9------  MODIFY ROLES_ID");
		System.out.println("10-------RETURN TO MAIN MENU");
		System.out.println("ENTER THE CHOICE");
		int choice = scanner.nextInt();
			boolean[] flag = new boolean[11];
			switch (choice) 
			{
		 case 1:
				System.out.println("ENTER THE NAME OF EMPLOYEE");
				String name = scanner.next();
				if(!Validate.is_name_valid(name))
				{
				System.out.println("INVALID NAME..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(1,name);
				flag[1]=true;
				}
				break;
		 case 2:
				System.out.println("ENTER THE EMAIL_ID :");
				String email_id=scanner.next();
				if(!Validate.is_email_valid(email_id))
				{
				System.out.println("INVALID EMAIL_ID..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(3, email_id);
				flag[2]=true;
				}
				break;
		 case 3:
				System.out.println("ENTER THE PHONE NO:");
				String phone_no=scanner.next();
				if(!Validate.validatePhoneNumber(phone_no))
				{
				System.out.println("INVALID PHONE NO..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(4,phone_no);
				flag[3]=true;
				}
				break;
				
		 case 4:
				System.out.println("ENTER THE ADRESS:");
				String adress=scanner.next();
				if(!Validate.is_adress_valid(adress))
				{
				System.out.println("INVALID ADDRESS..PLEASE TRY AGAIN");return;
				}
				else
				{
				hashMap.put(7, adress);
				flag[4]=true;
				}
				break;
				
	    case 5:
				System.out.println("ENTER YOUR DATE OF BIRTH:");
				String dob = scanner.next();
				if(!Validate.is_dob_valid(dob)){
				System.out.println("INVALID DOB..PLEASE TRY AGAIN");return;}
				else
				{
				hashMap.put(5, dob);
				flag[5]=true;
				}
				break;
				
	    case 6:
				System.out.println("ENTER YOUR DATE OF JOINING:");
				String doj = scanner.next(); 
				if(!Validate.is_doj_valid(doj))
				{
				System.out.println("INVALID DOJ..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(6, doj);
				flag[6]=true;
				}
				break;
				
				
	    case 7:
				System.out.println("ENTER YOUR PROJECT ID:");
				String project_id=scanner.next();
				if(!Validate.is_projectid_valid(project_id))
				{
				System.out.println("INVALID PROJECT_ID..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(8, project_id);
				flag[7]=true;
				}
				break;
				
				
				
	    case 8:
				System.out.println("ENTER YOUR DEPARTMENT ID");
				String department_id=scanner.next();
				if(!Validate.is_department_id_valid(department_id))
				{
				System.out.println("INVALID DEPARTMENT ID..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(9, department_id);
				flag[8]=true;
				}
				break;
		case 9:
				System.out.println("ENTER THE ROLES ID");
				String roles_id=scanner.next();
				if(!Validate.is_roles_id_valid(roles_id)){
				System.out.println("INVALID ROLES_ID..PLEASE TRY AGAIN");
				return;
				}
				else
				{
				hashMap.put(10,roles_id);
				flag[9]=true;
				}
				break;
		case 10:  ++x;
				 System.out.println("THANKS FOR USING EMS!!!!!");
				 System.out.println("VISIT AGAIN!!!");
				 break;

			}
		hashMap.put(2,id);
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		empl.ModifyEmployee(hashMap,flag,id);
		
		
		
		
	}			
	}  
	
	//REMOVE EMPLOYEE
	public void RemoveEmployee()
		{
		System.out.println("ENTER THE EMPLOYEMNT ID TO REMOVE: ");
		Scanner s= new Scanner(System.in);
		String id =s.next();
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		try
		{
		empl.RemoveEmployee(id);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class not found");
		}
		catch(SQLException e)
		{
			System.out.println("sql exception");
		}
		}
	public void SearchEmployee()throws ClassNotFoundException, SQLException
		{
		System.out.println("SEARCH OF AN EMPLOYEE!!!!");
		System.out.println("1----------------SEARCH BY EMAIL ID");
		System.out.println("2----------------SEARCH BY EMPLOYEE ID");
		System.out.println("3-----------------SEARCH BY NAME");
		System.out.println("ENTER THE CHOICE");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		EmployeeServiceImpl emp =new EmployeeServiceImpl();
		switch (choice) 
		{
		case 1:
			System.out.println("ENTER THE EMAIL ID TO SEARCH:");
			String email =scanner.next();
			emp.SearchEmployee(email);
			break;
		case 2:
			System.out.println("ENTER THE EMPLOYMENT ID TO SEARCH:");
			String kin_id =scanner.next();
			emp.SearchEmployee(kin_id);
			break;
		case 3:
			System.out.println("ENTER THE NAME OF EMPLOYEE:");
			String name =scanner.next();
			emp.SearchEmployee(name);
			break;
		}
		}
	public void GetallEmployee()throws ClassNotFoundException, SQLException
	{
	EmployeeServiceImpl empl =new EmployeeServiceImpl();
	empl.GetallEmployee();
	}
}
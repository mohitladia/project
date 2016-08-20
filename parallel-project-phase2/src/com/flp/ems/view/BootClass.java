package com.flp.ems.view;
import java.sql.SQLException;
import java.util.Scanner;
public class BootClass 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		while(true)
		{
			System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM!!!!!!");
			System.out.println("1 ------------------ ADD AN EMPLOYEE");
			System.out.println("2 ------------------ MODIFY EMPLOYEE");
			System.out.println("3 -------------------REMOVE EMPLOYEE");
			System.out.println("4 ------------------ SEARCH EMPLOYEE");
			System.out.println("5 ----------------- GET  DETAILS OF ALL EMPLOYEES");
			System.out.println("6--------------------EXIT");
			menu_selection();
		}
	}
		public static void menu_selection() throws ClassNotFoundException, SQLException
			{
				System.out.println("ENTER YOUR CHOICE:");
				Scanner s = new Scanner(System.in);
				int choice = s.nextInt();
				Userinteraction us = new Userinteraction();
				switch(choice)
				{
					case 1:  us.AddEmployee();	 break;
					case 2:  us.ModifyEmployee();break;
					case 3:  us.RemoveEmployee();break;
					case 4:  us.SearchEmployee();break;
					case 5:  us.GetallEmployee();break;
					case 6: if(choice==6)
						System.out.println("THANKS FOR USING EMS!!!!");
							break;
					default: System.out.println("INVALID INPUT!!!! PLEASE TRY AGAIN....");
				}
			}
}
		
			
				
		
			
					
					
				
				


		
		
		
		
		
		
	
	
	
	
	
	



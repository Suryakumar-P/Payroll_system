package com.myfss.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.myfss.beans.*;

public class ViewPayslip {

	/**
	 * @param args
	 */public static void viewPayslip() throws IOException
	 {
		 try
		 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String employeeId;
		System.out.println("Enter the Employee ID to view the payslip:");
		employeeId = br.readLine();
		System.out.println("Enter the month of the payslip");
		String dateString=br.readLine();
		 Employee e = EmployeeDAO.viewEmployee(employeeId);
			if((e.getEmployeeId).equals(employeeId))
			{
			Payslip p = EmployeeDAO.viewPaySlip(employeeId,dateString);
			System.out.println(p);
			br.close();
			}
			else
			{
				System.out.println("The employee Id is invalid. Please Enter a valid Employee Id.");
			}	 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
	
	public static void main(String[] args) {
		
	}
}
package com.myfss.ui;

import java.sql.SQLException;
import com.myfss.DAO.EmployeeDAO;
import com.myfss.beans.Employee;

public class Viewemployee {
	public static boolean Viewemployeedetails() throws SQLException{
		Employee ee = new Employee();
		ee = EmployeeDAO.viewEmployee(null);
		System.out.println("The employee details are:");
		System.out.println(ee);
		return false;
		
	}
}

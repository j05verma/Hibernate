package org.verma.employeeapp.controller;

import java.util.Scanner;

import org.verma.employeeapp.dao.EmployeeDao;
import org.verma.employeeapp.dto.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID to delete the record");
		int id=sc.nextInt();
		EmployeeDao dao=new EmployeeDao();
		if(dao.deleteEmployee(id)==true) {
			dao.deleteEmployee(id);
			System.out.println("Id "+id+" is record is deleted");
		}
		else {
			System.err.println("Id "+id+" is not Found");
		}	
		
	}

}

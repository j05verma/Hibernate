package org.verma.employeeapp.controller;

import java.util.Scanner;

import org.verma.employeeapp.dao.EmployeeDao;
import org.verma.employeeapp.dto.Employee;

public class VerifyEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the phone number");
		long phone=sc.nextLong();
		System.out.println("Enter the password");
		String password=sc.next();
		 EmployeeDao dao=new EmployeeDao();
		 
		 try {
			 Employee e= dao.verifyEmployee(phone, password);
				System.out.println("Welcome Mr. "+e.getName()+" Your login is Succesfull");
				System.out.println("ID: "+e.getId());
				System.out.println("designation: "+e.getDesg());
				System.out.println("Phone Number: "+e.getPhone());
				System.out.println("Salary: "+e.getSalary());
		} catch (Exception e2) {
			System.out.println("Invalid Phone Number or Password");
			// TODO: handle exception
		}
		 
		 
	}

}

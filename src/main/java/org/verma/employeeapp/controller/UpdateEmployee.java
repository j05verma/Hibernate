package org.verma.employeeapp.controller;

import java.util.Scanner;

import org.verma.employeeapp.dao.EmployeeDao;
import org.verma.employeeapp.dto.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id to update the record");
		int id=sc.nextInt();
		System.out.println("Enter the desg");
		String desg=sc.next();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		System.out.println("Enter the phone");
		long phone=sc.nextLong();
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		Employee e=new Employee();
		e.setId(id);
		e.setDesg(desg);
		e.setName(name);
		e.setPassword(password);
		e.setPhone(phone);
		e.setSalary(salary);
		
		EmployeeDao dao=new EmployeeDao();
		dao.updateEmployee(e);
		
	}

}

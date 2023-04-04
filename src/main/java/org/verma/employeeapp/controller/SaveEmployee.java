package org.verma.employeeapp.controller;

import java.util.Scanner;

import org.verma.employeeapp.dao.EmployeeDao;
import org.verma.employeeapp.dto.Employee;

public class SaveEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.nextLine();
		System.out.println("Enter your phone ");
		long phone=sc.nextLong();
		System.out.println("Enter your desg ");
		String desg=sc.next();
		System.out.println("Enter your salary");
		double sal=sc.nextDouble();
		System.out.println("Enter your password ");
		String password=sc.next();
		Employee e=new Employee();
		e.setName(name);
		e.setPassword(password);
		e.setPhone(phone);
		e.setDesg(desg);
		e.setSalary(sal);
		
		EmployeeDao dao=new EmployeeDao();
		e=dao.saveEmployee(e);
		System.out.println("Your Details are registered with ID: "+e.getId());
	}

}

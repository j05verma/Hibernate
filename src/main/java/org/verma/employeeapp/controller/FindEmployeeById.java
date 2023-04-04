package org.verma.employeeapp.controller;

import java.util.Scanner;

import org.verma.employeeapp.dao.EmployeeDao;
import org.verma.employeeapp.dto.Employee;

public class FindEmployeeById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to fetch the details:");
		int id=sc.nextInt();
		EmployeeDao dao=new EmployeeDao();
		Employee e=dao.findEmployeeById(id);
		try {
			 
				System.out.println("your name "+e.getName());
				System.out.println("your phone "+e.getPhone());
				System.out.println("your desg "+e.getDesg());
				System.out.println("your salary "+e.getSalary());
			
		} catch (Exception e2) {
			System.out.println("Id is not Found");
		//	e2.printStackTrace();
		}
		
	}

}

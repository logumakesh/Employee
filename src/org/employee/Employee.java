package org.employee;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		String empEmail = S.nextLine();
		System.out.println("employee email id is:" +empEmail );
		
		int empId = S.nextInt();
		System.out.println("employee id is :"+empId );
		
		String empName = S.next();
		System.out.println("employee name is:" +empName );
		
		long empPhoneno = S.nextLong();
		System.out.println("employee mobilenumber is :" +empPhoneno);
		
		float empSalary = S.nextFloat();
		System.out.println("employee salary is :" +empSalary);
		
		String empGender = S.next();
		System.out.println("employee gender is:" + empGender);
		
		String empCity = S.next();
		System.out.println("employee city is :" + empCity);
		
	}
}



package com.cg.ems.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpJpaDemo {

	public static void main(String[] args) {
		EmployeeService empSer = new EmployeeServiceImpl();
		System.out.println("Enter the employee id for which you want to retrieve the data");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// Employee e1 = new Employee();
		// e1.setEmpName("aaa");
		// e1.setEmpSal(80000.0f);
		// Employee e2 = new Employee(555, "Vikas Agrawal", 89000.0f, null);
		Employee ee1 = empSer.getEmpbyEid(n);
		// Employee ee2=empSer.addEmp(e2);
		System.out.println(ee1);
		System.out.println("Fetching all records");
		ArrayList<Employee> eList = empSer.fetchAllEmp();
		for (Employee ee : eList) {
			System.out.println(ee.getEmpId() + "\t" + ee.getEmpName() + "\t" + ee.getEmpSal());

		}
	}

}

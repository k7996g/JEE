package com.cg.eis.pl;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Service s=new Service();
         
          Employee e=s.setDetails();
          Scanner sc=new Scanner(System.in);
         /* System.out.println("enter the salary for insurance scheme");
          int salary=sc.nextInt();*/
          /*System.out.println("enter the designation for insurance scheme");
          String designation=sc.next();*/
          System.out.println("Salary is: "+e.getSalary());
          System.out.println("Employee name is: "+e.getEname());
          System.out.println("Employee id is: "+e.getEmpid());
          System.out.println("Employee designation is: "+e.getDesignation());
          System.out.println("Employee insurance scheme is: "+e.getInsurancescheme());
          s.insuranceScheme(e.getSalary(),e.getDesignation(),e);
          s.getDetails();
	}

}

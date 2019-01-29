package com.cg.eis.service;
import com.cg.eis.bean.*;
import java.util.Scanner;
public class Service implements EmployeeService {
	
           Employee e;
           public Employee setDetails()
           {Scanner sc=new Scanner(System.in);
               System.out.println("Enter the employee name");
               String ename=sc.next();
               System.out.println("Enter the employee id");
               int id=sc.nextInt();
               System.out.println("Enter employee designation");
               String desig=sc.next();
               System.out.println("Enter employee salary");
               int salary=sc.nextInt();
               System.out.println("enetr insurence");
               String insurance=sc.next();
                e=new Employee(id,ename,salary,desig,insurance);
               return e;
           }
           public void insuranceScheme(int salary,String designation,Employee a)
           {
        	   if(designation.equals("System Associate") && (salary>5000 && salary<20000))
        	   a.setInsurancescheme("C");
           else if(designation.equals("Programmer") && (salary>=20000 && salary<40000))
        	   a.setInsurancescheme("B");
           else if(designation.equals("Manager") && (salary>=40000))
        	   a.setInsurancescheme("A");
           else if(designation.equals("Clerk") && (salary<5000))
        	   a.setInsurancescheme("No");
        	  
           }
           public void getDetails()
           {System.out.println("Salary is: "+e.getSalary());
            System.out.println("Employee name is: "+e.getEname());
            System.out.println("Employee id is: "+e.getEmpid());
            System.out.println("Employee designation is: "+e.getDesignation());
            System.out.println("Employee insurance scheme is: "+e.getInsurancescheme());
           }
}

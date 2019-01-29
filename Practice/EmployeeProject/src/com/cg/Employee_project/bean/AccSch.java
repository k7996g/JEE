package com.cg.Employee_project.bean;

public class AccSch {
    Employee emp[]=new Employee[10];
    int index=0;
    int salary=0;
    DA o[]=new DA[10];
    public String addEmployee(int empno,String empname,char descode,String depart,int basic,int hra,int it,String joindate,DA o)
    {emp[index++]=new Employee(empno,empname,descode,depart,basic,hra,it,joindate,o);
       return "Employee added Successfully";
    }
    public int salary(int empno)
	{int i;
	
	for(i=0;i<index;i++)
	{if(emp[i].getEmpno()==empno)
	{int basic=emp[i].getBasic();
    int hra=emp[i].getHra();
    int it=emp[i].getIt();
    salary=basic+hra+o[i].getDa()-it;}}
	return salary;
	}
    public void showByEmpno(int empno)
    {int i=0;
    for(i=0;i<index;i++)
    {if(emp[i].getEmpno()==empno)
    {System.out.println("Employee no is: "+emp[i].getEmpno());
    System.out.println("Employee name is: "+emp[i].getEmpname());
    System.out.println("Employee department is: "+emp[i].getDepart());
    System.out.println("Employee Salary is: "+salary(empno));
    System.out.println("Designation is: "+o[i].getDesignation());
    }
    }
}
}

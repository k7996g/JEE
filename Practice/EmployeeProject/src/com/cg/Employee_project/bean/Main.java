package com.cg.Employee_project.bean;
import java.util.Scanner;
public class Main {
	 private static DA o;
	 private static DA[] o1=new DA[10];
     private static Employee emp[]=new Employee[10];
     private static AccSch accsch=new AccSch();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          int i;
          int choice;
          Scanner sc=new Scanner(System.in);
          for(i=0;i<5;i++)
          {switch(emp[i].getDesCode())
        	  { case 'e':o1[i].setDesignation("Engineer");
        	             o1[i].setDa(20000);
        	             break;
        	    case 'c':o1[i].setDesignation("Consultant");
	                     o1[i].setDa(32000);
	                     break;
        	    case 'k':o1[i].setDesignation("Clerk");
	                     o1[i].setDa(12000);
	                     break;
        	    case 'r':o1[i].setDesignation("Receptionist");
	                     o1[i].setDa(15000);
	                     break;
        	    case 'm':o1[i].setDesignation("Manager");
	                     o1[i].setDa(40000);
	                     break;
	            default: System.exit(0);	                     
        	  }
          }
          while(true)
          {   System.out.println("Enter your choice");
        	  choice=sc.nextInt();
              switch(choice)
              { case 1: addEmployeeDetails();
                        break;
                case 2: showByEmpId();
                        break;
                default: System.exit(0);;       
              }
          }
	}
          public static void addEmployeeDetails()
          {System.out.println("enter employee name");
          Scanner sc=new Scanner(System.in);
          String name=sc.nextLine();
          System.out.println("enter employee id");
          int id=sc.nextInt();
          System.out.println("enter employee department");
          String department=sc.nextLine();
          System.out.println("enter employee designation code");
          char c=sc.next().charAt(0);
          System.out.println("enter join date");
          String date=sc.nextLine();
          System.out.println("enter the basic value");
          int basic=sc.nextInt();
          System.out.println("enter the hra value");
          int hra=sc.nextInt();
          System.out.println("enter the it value");
          int it=sc.nextInt();
          if(c=='e')
        	   o=new DA("Engineer",20000);
          else if(c=='c')
        	  o=new DA("Consultant",30000);
          else if(c=='k')
        	  o=new DA("Clerk",12000);
          else if(c=='r')
        	  o=new DA("Receptionist",15000);
          else if(c=='m')
        	  o=new DA("Manager",40000);
          System.out.println(accsch.addEmployee(id,name,c,department,basic,hra,it,date,o));
	}
          public static void showByEmpId()
          { int empno;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the employee no");
            empno=sc.nextInt();
            accsch.showByEmpno(empno);
          }

}

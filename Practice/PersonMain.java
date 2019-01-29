package com.cg.lab6.bean;
import java.util.Scanner;
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter person first name");
String firstName=sc.nextLine();
System.out.println("Enter person last name");
String lastName=sc.nextLine();
System.out.println("Enter person age");
int age=sc.nextInt();
sc.close();
Person p=new Person(firstName,lastName,age);
try
{p.validate();

}
catch(Exception e)
{System.out.println("Exception is caught");

}
	}

}

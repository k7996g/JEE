package com.cg.lab6.bean;
import java.util.Scanner;
public class NameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter person age");
int age=sc.nextInt();
sc.close();
Name n=new Name(age);
try
{n.validate();

}
catch(Exception e)
{System.out.println("Exception is caught");

}
	}

}

package com.capg.eleven_4;

import java.util.Scanner;



public class Program4 {
public static void main(String[] args) {
	
 Scanner sc=  new Scanner(System.in);
 IProgram4 obj =()->{
	 return new simple();
 };
 simple s = obj.methodDemo();
 
 System.out.println("Enter the firstname");
 String fname = sc.nextLine();
 
System.out.println("enter the lastname");
String lname = sc.nextLine();

s.setFname(fname);
s.setLname(lname);

System.out.println(s);
}
}

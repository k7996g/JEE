package com.capgemini.view;

import com.capgemini.bean.*;
import com.capgemini.bl.*;
import java.util.Scanner;

public class MainApp {
	private static StudentScheduler studentsch = new StudentScheduler();
	private static Scanner o = new Scanner(System.in);

	public static void main(String args[]) {
		showMenu();
	}

	public static void showMenu() {
		int choice;
		while (true) {
			System.out.println();
			System.out.println("1: Add student");
			System.out.println("2: Show All Students");
			System.out.println("3: Show Students by Rollno");
			System.out.println("4: exit");
			System.out.println();
			choice = o.nextInt();

			switch (choice) {
			case 1:
				addStuDetails();
				break;
			case 2:
				showAllStudents();
				break;
			case 3: {
				showStudentByRollno();
				break;
			}
			default: {
				System.exit(0);
				break;
			}
			}
		}
	}

	private static void addStuDetails() {
		String sname = o.nextLine();
		int temp;
		String coursetemp;
		int sroll = o.nextInt();
		System.out.println("Enter no of courses");
		int n = o.nextInt();
		int i;
		temp = studentsch.checkRoll(sroll);
		while (temp == 0) {
			System.out.println("Roll No. exist! ");
			System.out.println("Enter different roll number: ");
			sroll = o.nextInt();
			temp = studentsch.checkRoll(sroll);
		}
		Courses course[] = new Courses[n];
		for (i = 0; i < n; i++) {
			coursetemp = o.nextLine();
			course[i] = new Courses(coursetemp, i + 1);
		}
		System.out.println(studentsch.addStudent(sname, sroll, course));
	}

	private static void showAllStudents() {
		studentsch.showAllStudents();
	}

	private static void showStudentByRollno() {
		int sroll;
		System.out.println("enter the rollno");
		sroll = o.nextInt();
		studentsch.showByRoll(sroll);
	}
}

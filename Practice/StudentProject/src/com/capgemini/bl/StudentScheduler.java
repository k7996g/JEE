package com.capgemini.bl;

import com.capgemini.bean.*;

public class StudentScheduler {
	private Student[] student = new Student[10];
	private Courses[] ctemp;
	private int counter = 0;

	public String addStudent(String sname, int sroll, Courses[] course) {
		student[counter++] = new Student(sname, sroll, course);
		return "student added successfully";
	}

	public int checkRoll(int sroll) {
		int i, f = 0;
		for (i = 0; i < counter; i++) {
			if (student[i].getStuRoll() == sroll) {
				f = 1;
				break;
			}
		}
		if (f == 1)
			return 0;
		else
			return 1;
	}

	public void showAllStudents() {
		int i;
		for (i = 0; i < counter; i++) {
			System.out.println("Student name is: " + student[i].getStuName());
			System.out.println("Student roll no is: " + student[i].getStuRoll());
			ctemp = student[i].getCourses();
			int j = 0;
			System.out.println("courses are:");
			for (j = 0; j < ctemp.length; j++) {
				System.out.println(student[j].getCourses());
			}

		}
	}

	public void showByRoll(int sroll) {
		int i;
		for (i = 0; i < counter; i++) {
			if (student[i].getStuRoll() == sroll) {
				System.out.println("Student name is: " + student[i].getStuName());
				System.out.println("Student roll no is: " + student[i].getStuRoll());
				ctemp = student[i].getCourses();
				int j = 0;
				System.out.println("courses are:");
				for (j = 0; j < ctemp.length; j++) {
					System.out.println(student[j].getCourses());
				}

			} else
				System.out.println("Roll no is wrong");

		}
	}
}

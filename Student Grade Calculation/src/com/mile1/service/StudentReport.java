package com.mile1.service;

import com.mile1.bean.*;
import commile1.exception.*;
import java.util.*;

public class StudentReport {
	ArrayList<Student> a = new ArrayList<Student>();

	public String findGrade(Student studentObject) {
		Student student = studentObject;
		int sum = 0;
		a.add(student);
		for (int i = 0; i < 3; i++)
			if (student.getMarks()[i] < 35)
				return "F";
			else {
				sum += student.getMarks()[i];
			}
		if (sum <= 150)
			return "D";
		else if (sum > 150 && sum <= 200)
			return "C";
		else if (sum > 200 && sum <= 250)
			return "B";
		else if (sum > 250 && sum <= 300)
			return "A";
		return "0";
	}

	public String validate(Student studentObject)
			throws NullStudentException, NullNameException, NullMarksArrayException {
		if (studentObject == null) {
		throw new NullStudentException("Student Object is null");}
		 else {
			if (studentObject.getName() == null) {
				throw new NullNameException("Student has no name");
			} else {
				for (int i = 0; i < 3; i++) {
					if (studentObject.getMarks()[i] == 0) {
						throw new NullMarksArrayException("Student has no marks");
					}
				}
			}

		}
		return (findGrade(studentObject));
	}

	public int findNumberOfNullMarks(Student data[])
			throws NullMarksArrayException, NullNameException, NullStudentException {
		Student x[] = data;
		String s;
		int count = 0;
		for (int i = 0; i < 2; i++) {
			for(int j=0;j<3;j++)
			if(x[i].getMarks()[j]==0)
				{count++;break;}
		}
		return count;
	}

	public int findNumberOfNullNames(Student data[])
			throws NullMarksArrayException, NullNameException, NullStudentException {
		Student x[] = data;
		String s;
		int count = 0;
		for (int i = 0; i < 2; i++) {
			if(x[i].getName()==null)
				count++;
		}
		return count;
	}

	public int findNumberOfNullObjects(Student data[])
			throws NullMarksArrayException, NullNameException, NullStudentException {
		Student x[] = data;
		String s;
		int count = 0;
		for (int i = 0; i < 2; i++) {
			if(x[i]==null)
				count++;
		}
		return count;
	}
}

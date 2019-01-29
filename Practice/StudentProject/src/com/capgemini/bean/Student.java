package com.capgemini.bean;

import com.capgemini.bean.Courses;

public class Student {

	private String stuName;
	private int stuRoll;
	private Courses[] courses;

	public Student(String stuName, int stuRoll, Courses[] courses) {
		super();
		this.stuName = stuName;
		this.stuRoll = stuRoll;
		this.courses = courses;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuRoll() {
		return stuRoll;
	}

	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}

	public Courses[] getCourses() {
		return courses;
	}

	public void setCourses(Courses[] courses) {
		this.courses = courses;
	}

}

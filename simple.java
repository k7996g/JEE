package com.capg.eleven_4;

public class simple {
private String fname;
private String lname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "simple [fname=" + fname + ", lname=" + lname + "]";
}

}

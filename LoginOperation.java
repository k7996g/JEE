package com.capg.eleven_3;

public abstract class LoginOperation implements ILoginOperation {

	public static void main(String[] args) {
		ILoginOperation log = (uname,pass)-> uname.equals(pass)? true:false;
		boolean result = log.login("hai","hai");
		System.out.println(result);
	}
}

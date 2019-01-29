package com.cg.lab6.bean;
class ValidateAgeException extends Exception
{ValidateAgeException(String s)
	{super(s);}
}
public class Name {
     
    private int age;
	public Name( int age) {
		super();
		
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public void validate() throws ValidateAgeException
    { if(age<15)
    	throw new ValidateAgeException("Age is less than 15");
    else
    {
    System.out.println("Age is: "+age);
    }
    }
}

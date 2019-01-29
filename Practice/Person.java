package com.cg.lab6.bean;
class ValidateNameException extends Exception
{ValidateNameException(String s)
	{super(s);}
}
public class Person {
     private String firstName;
    private String lastName;
    private int age;
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public void validate() throws ValidateNameException
    { if(firstName.equals("")&&lastName.equals(""))
    	throw new ValidateNameException("Name is blank");
    else
    {System.out.println("Name is: "+firstName+" "+lastName);
    System.out.println("Age is: "+age);
    }
    }
}

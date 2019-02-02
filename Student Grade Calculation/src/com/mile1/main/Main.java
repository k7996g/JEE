package com.mile1.main;
import com.mile1.bean.*;
import commile1.exception.*;
import java.util.*;
import com.mile1.service.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student data[]=new Student[4];
     for(int i=0;i<4;i++)
    	 data[i]=new Student();
     data[0]=new Student("Sekar",new int[] {35,35,35});
     data[1]=new Student(null,new int[] {11,22,33});
     data[2]=null;
     data[3]=new Student("Manoj",null);
     StudentReport s=new StudentReport();
    
     System.out.println(s.findGrade(data[1]));
     try
     {
     System.out.println(s.validate(data[1]));
     System.out.println(s.validate(data[2]));
	}
     catch(NullStudentException e)
     {
     System.out.println("student object is null");}
     catch(NullMarksArrayException f)
     {System.out.println("student has no marks");
     
     }
     catch(NullNameException g)
     {System.out.println("student has no name");}
	}
}

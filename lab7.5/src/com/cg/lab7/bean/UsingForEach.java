package com.cg.lab7.bean;
import java.util.*;
import java.util.Scanner;
public class UsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int i;
          String s;
          System.out.println("Enter the elements of the list");
          ArrayList<String> a=new ArrayList<String>();
          for(i=0;i<5;i++)
          {s=sc.nextLine();
          a.add(s);
          }
          UsingForEach u=new UsingForEach();
          u.sortNames(a);
	}
               public void sortNames(List a)
               {ArrayList<String> a1=new ArrayList<String>();
               a1.addAll(a);
               Collections.sort(a1);
               for(String s:a1)
               {System.out.println(s);
               
               }
               }
}

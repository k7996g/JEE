package com.cg.lab7.bean;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int a[]=new int[3];
          SortAndReverse s1=new SortAndReverse();
          System.out.println("Enter the no of the elements of the array");
          int n=sc.nextInt();
          int i;
          System.out.println("Enter the elements of the array");
          for(i=0;i<n;i++)
          {a[i]=sc.nextInt();
          
          }
          s1.getSorted(a);
	}

}

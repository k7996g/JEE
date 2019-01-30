package com.cg.lab7.bean;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int a[]=new int[5];
          System.out.println("Enter the elements of the array");
          int i;
          for(i=0;i<5;i++)
          {a[i]=sc.nextInt();
          
          }
          Squares s=new Squares();
          HashMap<Integer,Double> h=new HashMap<Integer,Double>();
          
         h= s.getSquares(a);
         System.out.println(h);
	}
           public HashMap getSquares(int a[])
           {HashMap<Integer,Double> hm=new HashMap<Integer,Double>();
                int i;
                for(i=0;i<a.length;i++)
                	hm.put(a[i], Math.pow(a[i],2));
                return hm;
           }
}

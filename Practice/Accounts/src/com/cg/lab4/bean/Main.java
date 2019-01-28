package com.cg.lab4.bean;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p1=new Person("smith",21.0f);
         Person p2=new Person("Kathy",21.0f);
         Random rand=new Random();
         int x=rand.nextInt(10000)+1;
         Account a=new Account(x,2000,p1);
         int y=rand.nextInt(10000)+1;
         if(x==y)
         {while(x!=y)
         { y=rand.nextInt(10000)+1;}
	}
        	 Account a1=new Account(y,3000,p2);
        	 System.out.println(a.getBalance());
        	 a.deposit(2000);
        	 a1.withdraw(2000);
        	 System.out.println(a.getBalance());
        	 System.out.println(a1.getBalance());
        	 System.out.println(a.toString());
        	 System.out.println(a1.toString());

}
}

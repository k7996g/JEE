package com.capg.eleven_5;

import java.util.Scanner;

public class Factorial implements IFactorial{

	int f=1;
	public void fact()
	{
		System.out.println("Enter fact");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    if(num>0 ){
	    for (int i =1;i<=num;i++) {
	    		f=f*i;
	    }
	    
	    }
	    else 
	    {
	    	System.out.println("1");
	    	}
	    	System.out.println(f);
	    }
	 public static void main(String[] args) {
	    	Factorial e = new Factorial();
	    	IFactorial ref = e::fact;//method reference
	        ref.fact();
	        
	    }
	    }
	

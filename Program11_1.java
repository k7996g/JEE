package com.capg.eleven_1;

public abstract class Program11_1 implements  PowInterface {
	public static void main(String[] args) {
		PowInterface p =(double x,double y)->{double m=Math.pow(x,y); System.out.println(m); return m;};
		p.power(2.0,2.0);
		
	}

}

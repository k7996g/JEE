package com.cg.pak8.bean;
import java.io.*;
public class CopyDataThread extends Thread {
FileReader input=null;
FileWriter output=null;
public CopyDataThread(FileReader input, FileWriter output) {
	super();
	this.input = input;
	this.output = output;
}
public void run() 
{
int i=0,j=0;
try {
	while((i=input.read())!=-1)
	{output.write((char)i);j++;
	System.out.print((char)i);
	if(j%10==0)
	{
	System.out.println("10 characters are copied");
	Thread.sleep(5000);
	}
	}
	System.out.println("Copying is done");
} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

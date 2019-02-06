package com.cg.pak8.bean;
import java.io.*;
public class FileProgram {
	public static void main(String[] args) {
		
		CopyDataThread s=null;
     try {
		 s=new CopyDataThread(new FileReader("C:\\Users\\KAUGARG\\Documents\\input.txt"),new FileWriter("C:\\Users\\KAUGARG\\Documents\\output.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     s.start();
}
}

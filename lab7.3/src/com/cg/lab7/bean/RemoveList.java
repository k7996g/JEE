package com.cg.lab7.bean;
import java.util.*;

public class RemoveList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         
         ArrayList<String> a=new ArrayList<String>();
         a.add("Kaushal");
         a.add("Garg");
         a.add("keshav");
         a.add("chaudhary");
         
         ArrayList<String> b=new ArrayList<String>();
         b.add("keshav");
         b.add("chaudhary");
         RemoveList r=new RemoveList();
         r.removeElements(a,b);
         
	}
          public void removeElements(List a,List b)
          {ArrayList<String> a1=new ArrayList<String>();
          ArrayList<String> a2=new ArrayList<String>();
          a1.addAll(a);
          a2.addAll(b);
          a1.removeAll(a2);
          Iterator i=a1.iterator();
          System.out.println("Remaining elements after removing elements of the second list");
          while(i.hasNext())
          {System.out.println(i.next());
          
          }
          }
}

package com.cg.lab7.bean;
import java.util.*;
public class SortAndReverse {
         public int[] getSorted(int a[])
         {ArrayList<String> s=new ArrayList<String>();
          int i;
          int b[]=new int[a.length];
          for(i=0;i<a.length;i++)
          { String s1=Integer.toString(a[i]);
          StringBuilder s2=new StringBuilder(s1);
          s2.reverse();
          String s3=new String(s2);
          s.add(s3);
          }
          Collections.sort(s);
          String c[]=s.toArray(new String[0]);
          for(i=0;i<c.length;i++)
          {b[i]=Integer.parseInt(c[i]);}
          return b;
         /* Iterator j=s.iterator();
          while(j.hasNext())
        	  System.out.println(j.next());*/
         }
}

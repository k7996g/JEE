package com.cg.lab7.bean;
import java.util.*;
public class SortAndReverse {
         public void getSorted(int a[])
         {ArrayList<Integer> s=new ArrayList<Integer>();
          int i;
          for(i=0;i<a.length;i++)
        	  s.add(a[i]);
          Collections.sort(s);
          Collections.reverse(s);
          Iterator j=s.iterator();
          while(j.hasNext())
        	  System.out.println(j.next());
         }
}

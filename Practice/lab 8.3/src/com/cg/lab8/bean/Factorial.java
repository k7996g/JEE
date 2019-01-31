package com.cg.lab8.bean;
import java.util.Random;
import java.lang.Math;
public class Factorial extends Thread{
      static int c=0;
      static int f=1;
      static int x;
      Random rand=new Random();
      public void run()
      {if(c!=1)
      {
       x=rand.nextInt(10)+1;c++;
       System.out.println(x);
      }
      else
      {for(int i=1;i<=x;i++)
      {f=f*i;
      
      }
      System.out.println(f);
      }
      }
}

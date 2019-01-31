package com.cg.lab8.bean;
import java.util.Random;
import java.lang.Math;
public class Factorial extends Thread{
      static int c=0;
      static int f=1;
      static int x;
      public void run()
      {if(c!=1)
      {/*Random rand=new Random();
       x=rand.nextInt(10000)+1;c++;*/c++;
       x=4;
      }
      else
      {for(int i=1;i<=x;i++)
      {f=f*i;
      
      }
      System.out.println(f);
      }
      }
}

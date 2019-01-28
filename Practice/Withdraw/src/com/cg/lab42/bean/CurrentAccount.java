package com.cg.lab42.bean;

public class CurrentAccount extends Account {
      int limit=50000;
      boolean b;
      boolean withdraw(int limit)
      {if(this.limit<limit)
    	  return false;
      else
    	  return true;
      }
}

package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
       public Employee setDetails();
       public void insuranceScheme(int salary,String designation,Employee e);
       public void getDetails();
       
}

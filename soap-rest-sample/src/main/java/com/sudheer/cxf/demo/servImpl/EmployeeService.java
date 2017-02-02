package com.sudheer.cxf.demo.servImpl;

import javax.jws.WebService;

@WebService
public interface EmployeeService {

	 public String getEmployeesByName( String name);
}

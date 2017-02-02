package com.sudheer.test.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sudheer.cxf.demo.servImpl.EmployeeService;

public class SoapClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "client-bean.xml" });
		EmployeeService employeeService = (EmployeeService) context.getBean("orderClient");
		// Populate the Order bean

		System.out.println(employeeService.getEmployeesByName("sudheer"));

	}

}

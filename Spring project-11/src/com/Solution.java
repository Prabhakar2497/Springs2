package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new 
			ClassPathXmlApplicationContext("config.xml");
	Company company=(Company)context.getBean("company");
	System.out.println("Company Name:"+company.getCompanyName());
	System.out.println("Employee Name:"+company.getEmployee().getEmpName());
}
}

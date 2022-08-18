package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Citizen {
public static void main(String[] args) {
	ApplicationContext context=new 
	ClassPathXmlApplicationContext("config.xml");
	Country country=(Country)context.getBean("c");
	System.out.println(country);
	System.out.println("------------------");
	System.out.println("Country Name:"+country.getCountryName());
	System.out.println("State Name:"+country.getState().getStateName());
	System.out.println("District Name:"+country.getState().getDistrict().getDistrictName());
}
}

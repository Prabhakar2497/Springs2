package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ApplicationContext context=new
ClassPathXmlApplicationContext("config.xml");
	Person person=(Person)context.getBean("person");
	System.out.println("Age:"+person.getAge());
	System.out.println("Name:"+person.getName());
	System.out.println("Brand:"+person.getMobile().getBrand());
	System.out.println("Cost:"+person.getMobile().getCost());
	System.out.println("Apps:"+person.getMobile().getApps());
	System.out.println("---------------");
	List<String>listOfApps=person.getMobile().getApps();
	for(String app:listOfApps){
		System.out.println(app);
	}
}
}

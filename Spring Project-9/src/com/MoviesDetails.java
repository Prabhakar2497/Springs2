package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoviesDetails {
public static void main(String[] args) {
	ApplicationContext context=new
			ClassPathXmlApplicationContext("config.xml");
	SandalWood m1=(SandalWood)context.getBean("m1");
	 System.out.println(m1);
	 System.out.println("------------");
	 SandalWood m2=(SandalWood)context.getBean("m2");
	 System.out.println(m2);
}
}

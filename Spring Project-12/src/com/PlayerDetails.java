package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerDetails {
public static void main(String[] args) {
	ApplicationContext context=new
	ClassPathXmlApplicationContext("config.xml");
	Team t1=(Team)context.getBean("t1");
	System.out.println(t1);
	Player p1=(Player)context.getBean("p1");
	System.out.println(p1);
	System.out.println("-----------------");
	Team t2=(Team)context.getBean("t2");
	System.out.println(t2);
	Player p2=(Player)context.getBean("p2");
	System.out.println(p2);
}
}

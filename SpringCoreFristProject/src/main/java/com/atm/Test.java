package com.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Object ob = ac.getBean("moj");
		System.out.println(ob);
	}

}

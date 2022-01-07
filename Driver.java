package com.te.spring;

import java.awt.Container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
		Car bean = classPathXmlApplicationContext.getBean(Car.class);
		bean.move();
		Engine bean2 = classPathXmlApplicationContext.getBean(Engine.class);
		bean2.start();
		
		
	}
	
}

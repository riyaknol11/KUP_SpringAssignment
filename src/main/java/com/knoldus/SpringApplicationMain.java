package com.knoldus;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringApplicationMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessagePrinter messagePrinter = (MessagePrinter) context.getBean("messagePrinter");
		messagePrinter.printMessage();
	}

}

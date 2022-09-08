package com.albusxing.showcase.spring.applicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Albusxing
 * @created 2022/9/6
 */
public class MyBeanFactoryPostProcessorDemo {


	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext/applicationContext.xml");

		Book book = applicationContext.getBean(Book.class);
		System.out.println(book);
	}
}

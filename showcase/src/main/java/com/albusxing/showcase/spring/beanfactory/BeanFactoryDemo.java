package com.albusxing.showcase.spring.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Albusxing
 * @created 2022/9/2
 */
public class BeanFactoryDemo {


	@SuppressWarnings("all")
	public static void main(String[] args) {

		// 初始化 XmlBeanFactory
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory/applicationContext.xml"));

//		Student student = beanFactory.getBean(Student.class);
//		System.out.println("student=" + student);

//		StudentWithAware studentWithAware = beanFactory.getBean(StudentWithAware.class);
//		System.out.println(studentWithAware);

//
//		BeanNameAwareImpl beanNameAwareImpl = beanFactory.getBean(BeanNameAwareImpl.class);
//		System.out.println(beanNameAwareImpl.getBeanName());


		Book book = (Book)beanFactory.getBean("book");
		System.out.println(book);
	}
}

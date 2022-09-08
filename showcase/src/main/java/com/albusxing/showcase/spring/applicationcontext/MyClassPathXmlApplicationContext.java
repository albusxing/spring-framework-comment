package com.albusxing.showcase.spring.applicationcontext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Albusxing
 * @created 2022/9/6
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String configLocation) {
		super(configLocation);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("重写ClassPathXmlApplicationContext的postProcessBeanFactory()方法");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("book");
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		beanDefinition.setDescription("重写ApplicationContext");

	}
}

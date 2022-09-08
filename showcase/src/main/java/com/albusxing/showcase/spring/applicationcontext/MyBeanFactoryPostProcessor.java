package com.albusxing.showcase.spring.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Albusxing
 * @created 2022/9/6
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("重写BeanFactoryPostProcessor的postProcessBeanFactory()方法");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("book");
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		beanDefinition.setDescription("重写BeanFactoryPostProcessor");
	}
}

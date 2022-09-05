package com.albusxing.showcase.spring.beanfactory;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Albusxing
 * @created 2022/9/2
 */
public class BeanNameAwareImpl implements BeanNameAware {

	private String beanName;

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}

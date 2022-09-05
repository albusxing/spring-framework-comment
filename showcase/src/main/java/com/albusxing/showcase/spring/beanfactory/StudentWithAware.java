package com.albusxing.showcase.spring.beanfactory;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Albusxing
 * @created 2022/9/2
 */
public class StudentWithAware implements BeanNameAware  {

	private String code;
	private String name;
	private int age;

	private String beanName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentWithAware{" +
				"code='" + code + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				", beanName='" + beanName + '\'' +
				'}';
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setBeanName(String name) {
		// bean的name其实就是 xml中配置的bean的id
		System.out.println("调用BeanNameAware#setBeanName()，name=" + name);
		this.beanName = name;
	}
}

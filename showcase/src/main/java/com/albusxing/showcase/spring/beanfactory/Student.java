package com.albusxing.showcase.spring.beanfactory;

/**
 * @author Albusxing
 * @created 2022/9/2
 */
public class Student {

	private String code;
	private String name;
	private int age;

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
		return "Student{" +
				"code='" + code + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

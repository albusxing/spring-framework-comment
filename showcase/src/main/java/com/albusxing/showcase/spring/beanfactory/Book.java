package com.albusxing.showcase.spring.beanfactory;

/**
 * @author Albusxing
 * @created 2022/9/3
 */
public class Book {

	private String title;
	private String author;

	public Book() {
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}

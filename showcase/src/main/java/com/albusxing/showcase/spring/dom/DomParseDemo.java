package com.albusxing.showcase.spring.dom;

import com.albusxing.showcase.spring.beanfactory.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Albusxing
 * @created 2022/9/2
 */
public class DomParseDemo {

	private static Document getDocument(String xmlPath) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

			return documentBuilder.parse(xmlPath);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("XML文档解析错误");
		}
	}


	private static List<Student> getStudents(String xmlPath) {

		Document document = getDocument(xmlPath);

		List<Student> students = new ArrayList<>();
		NodeList studentNodeList = document.getElementsByTagName("student");

		for (int i = 0; i < studentNodeList.getLength(); i++) {

			Element studentElement = (Element)studentNodeList.item(i);

			String code = studentElement.getElementsByTagName("code").item(0).getTextContent();
			String name = studentElement.getElementsByTagName("name").item(0).getTextContent();
			String age = studentElement.getElementsByTagName("age").item(0).getTextContent();

			Student student = new Student();
			student.setCode(code);
			student.setName(name);
			student.setAge(Integer.parseInt(age));

			students.add(student);
		}

		return students;
	}

	public static void main(String[] args) {

		String xmlPath = "/Users/liguoqing/myworkspace/open-source-case/spring-framework-5.2.6.RELEASE/showcase/src/main/resources/dom/student.xml";
		List<Student> students = getStudents(xmlPath);
		System.out.println(students);
	}
}

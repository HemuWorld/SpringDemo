package com.hemuworld.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentCon {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
		System.out.println("");
		System.out.println("");
		System.out.println(student1);
		System.out.println("---------------------------------------------------------");
		
        Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		System.out.println("---------------------------------------------------------");
		
        Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
	}
}

package com.hemuworld.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTest {
    public static void main(String[] args) {
        System.out.println("Hello EmployeeCon!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/hemuworld/ci/ciconfig.xml");
        Person p = (Person) context.getBean("person");
        
        System.out.println();
        System.out.println();
        System.out.println(p);
    }
}

package com.hemuworld.springdemomycollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeCon {
    public static void main(String[] args) {
        System.out.println("Hello EmployeeCon!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/hemuworld/springdemomycollections/collectionconfig.xml");

        Employee employee1 = (Employee) context.getBean("employee1");
        
        System.out.println();
        System.out.println();
        System.out.println(employee1);
        System.out.println("---------------------------------------------------------");
    }
}

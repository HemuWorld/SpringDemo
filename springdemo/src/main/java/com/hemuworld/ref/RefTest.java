package com.hemuworld.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    public static void main(String[] args) {
        System.out.println("Hello EmployeeCon!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/hemuworld/ref/refconfig.xml");
        A temp = (A) context.getBean("aref");
        
        System.out.println();
        System.out.println();
        System.out.println(temp.getX());
        System.out.println("---------------------------------------------------------");
        System.out.println(temp.getOb().getY());
    }
}

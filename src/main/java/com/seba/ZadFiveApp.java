package com.seba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZadFiveApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer.getName());
        System.out.println(computer.ram.getValue());

    }
}

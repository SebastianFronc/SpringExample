package com.seba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZadOneApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ZadOne zadOne = (ZadOne) context.getBean("zadOne");
        System.out.println(zadOne.getNumerOne());
        zadOne.setNumerOne(5);
        System.out.println(zadOne.getNumerOne());
        System.out.println(zadOne.addTwoNumbers());

    }
}

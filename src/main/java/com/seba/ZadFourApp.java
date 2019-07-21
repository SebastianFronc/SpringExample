package com.seba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZadFourApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ZadFour zadFour = (ZadFour) context.getBean("beanForTemplate");
        System.out.println(zadFour.getText1());
        System.out.println(zadFour.getText2());
        System.out.println(zadFour.getText3());



    }
}

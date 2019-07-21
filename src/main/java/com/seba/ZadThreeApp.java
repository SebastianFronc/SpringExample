package com.seba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZadThreeApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ZadThree zadThree = (ZadThree) context.getBean("zadThree");
        System.out.printf(zadThree.getText());
        ((ClassPathXmlApplicationContext) context).close();

    }



}

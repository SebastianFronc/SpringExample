package com.seba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZadTwoApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ZadTwo zadTwo = (ZadTwo) context.getBean("zadTwo");
        System.out.println(zadTwo.getText());
        zadTwo.setText("BBBB");
        System.out.println(zadTwo.getText());
        ZadTwo zadTwo2 = (ZadTwo) context.getBean("zadTwo");
        System.out.println(zadTwo2.getText());
    }
}

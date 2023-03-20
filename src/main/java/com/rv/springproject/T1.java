package com.rv.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JavaLanguage javaLanguage = context.getBean("Framework", JavaLanguage.class);
        System.out.println(javaLanguage.learningJava());
        context.close();
    }
}

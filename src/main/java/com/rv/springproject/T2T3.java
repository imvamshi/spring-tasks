package com.rv.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T2T3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PythonLanguage pythonLanguage = context.getBean("pythonBean", PythonLanguage.class);
        System.out.println(pythonLanguage.learningPython());
        context.close();
    }
}

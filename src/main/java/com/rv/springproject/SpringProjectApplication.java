package com.rv.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringProjectApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MyIDE ide = context.getBean("javaIDE", MyIDE.class);
        System.out.println(ide.loadLanguageTools());

        context.close();
    }

}




//package com.rv.springproject;
//
//        import org.springframework.boot.SpringApplication;
//        import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringProjectApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringProjectApplication.class, args);
//    }
//
//}

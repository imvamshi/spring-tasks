package com.rv.springproject;

import org.springframework.stereotype.Component;

@Component("framework")
public class JavaWorld implements JavaLanguage {
    @Override
    public String learningJava() {
        return "I am learning java.";
    }
}

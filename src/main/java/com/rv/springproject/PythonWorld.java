package com.rv.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pythonBean")
public class PythonWorld implements PythonLanguage{

    private JavaLanguage framework;

    @Autowired
    public PythonWorld(JavaLanguage javaLanguageArg) {
        framework = javaLanguageArg;
    }
    @Override
    public String learningPython() {
        String metadata = framework.learningJava();
        return metadata + "I am learning python.";
    }
}

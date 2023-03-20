package com.rv.springproject;

public class MyJavaIDE implements MyIDE {

    @Override
    public String loadLanguageTools() {
        return "Successfully loaded JAVA libraries.";
    }
}

package com.rv.springproject;

public class MyRustIDE implements MyIDE{
    @Override
    public String loadLanguageTools() {
        return "Loaded RUST modules. RUST is now ready!";
    }
}

package com.rv.springproject;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Login {
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}

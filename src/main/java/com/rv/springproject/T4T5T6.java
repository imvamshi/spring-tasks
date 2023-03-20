package com.rv.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class T4T5T6 {

    public static void main(String[] args) {
        SpringApplication.run(T4T5T6.class, args);
        System.out.println("\n===========================================================================================");
        System.out.println("Hello Spring boot application is Up! The server also should be up! test the localhost URLs.");
        System.out.println("===========================================================================================");
    }

    @GetMapping("/")
    public String hello() {
        return "Congrats! Server's up dude!";
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/getjson")
    public Map<String, String> getJson() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, JSON!");
        return response;
    }

    /* Task 6: This tests the POST request, the endpoint is login, and it prints the username
     * and the password used for login.
     */
    @PostMapping("/login")
    public Map<String, String> postRequest(@RequestBody Login login) {
        Map<String, String> response = new HashMap<>();
        response.put("message", login.toString());
        return response;
    }

} // End of Class
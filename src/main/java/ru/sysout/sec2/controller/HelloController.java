package ru.sysout.sec2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user() {
        return "User";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "Admin";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

}

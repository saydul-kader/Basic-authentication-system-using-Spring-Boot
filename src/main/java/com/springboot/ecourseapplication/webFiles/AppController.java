package com.springboot.ecourseapplication.webFiles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/courses")
    public String courses(){
        return "courses";
    }
}

package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HelloController {
    
    @GetMapping("hello") //주소 /hello이면 작동시킴
    public String hello(Model model) {
        model.addAttribute("data", "spring!!!!!!");
        return "hello";   // resources.templaltes.hello.html을 찾음
    }
    
}
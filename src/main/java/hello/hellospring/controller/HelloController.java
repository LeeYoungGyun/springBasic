package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello") // 주소 /hello이면 작동시킴
    public String hello(Model model) {
        model.addAttribute("data", "spring!!!!!!");
        return "hello"; // resources.templaltes.hello.html을 찾음
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";

    }

}
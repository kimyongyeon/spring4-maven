package com.tony.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index(Model m) {

        m.addAttribute("someAttribute", "someValue");
        m.addAttribute("memo", "spring4");
        return "index";
    }
}

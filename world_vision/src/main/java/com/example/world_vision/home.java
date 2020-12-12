package com.example.world_vision;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class home {

    @GetMapping("/")
    public String hello(Model model){

        model.addAttribute("message", "Mire se ardhe ne home page");
        return "home";
    }





}

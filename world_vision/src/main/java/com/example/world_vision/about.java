package com.example.world_vision;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class about {
    @GetMapping("/about")
    public String aboutMethod(Model model){

        model.addAttribute("aboutmessage","Mirese erdhe ne about page");
        return "about";

    }

}

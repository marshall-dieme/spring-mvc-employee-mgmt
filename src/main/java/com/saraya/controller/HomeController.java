package com.saraya.controller;

import com.saraya.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(ModelMap model){
        model.get("username");
        return "home";
    }
}

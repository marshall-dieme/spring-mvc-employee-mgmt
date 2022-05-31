package com.saraya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

@Controller
@SessionAttributes("username")
public class LoginController {

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password
        , ModelMap model){
        if (username.equals("marshall") && password.equals("secret")){
            model.put("username", username);
            return "redirect:home";
        }
        return "index";
    }

    @RequestMapping(value = "/login1", method = RequestMethod.POST)
    public String login1(@RequestParam String username
            , @RequestParam String password
            , ModelMap model) {
        model.addAttribute("user", username);
        return "redirect:/home";
    }


}

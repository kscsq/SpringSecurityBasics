package ru.kscsq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AdminController {

    @GetMapping("admin")
    public String adminPage(ModelMap modelMap, Principal principal) {
//        System.out.println(principal.getName());
        return "admin";
    }
}

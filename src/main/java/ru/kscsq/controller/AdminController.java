package ru.kscsq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kscsq.service.AdminService;

import java.security.Principal;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("admin")
    public String adminPage(ModelMap modelMap, Principal principal) {
//        System.out.println(principal.getName());
        return "admin";
    }

    @GetMapping("adminService")
    public String adminService(ModelMap modelMap) {
        adminService.performSomeAdminService();
        return "admin";
    }
}

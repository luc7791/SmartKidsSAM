package com.lucas.sda.kids.controller;

import com.lucas.sda.kids.model.Users;
import com.lucas.sda.kids.model.UsersDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Value("${messages.home:default-value}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Model model) {
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("message", message);
        return "home";
    }


    // sa returneze doar capul de tabel (cand e front)

    @RequestMapping("/usersValidation")
    public String catsPage(Model model) {
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("user", new UsersDto());
        model.addAttribute("message", message);
        return "usersValidation";
    }







}

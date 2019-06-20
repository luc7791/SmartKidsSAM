package com.lucas.sda.kids.controller;

import com.lucas.sda.kids.model.Users;
import com.lucas.sda.kids.model.UsersDto;
import com.lucas.sda.kids.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {
        private static final Logger log = LoggerFactory.getLogger(UsersController.class);

        @Autowired
        UsersService usersService; //(inject UsersService class)

        @GetMapping
        public String getUsers(Model model){
            log.info("Spring Boot Thymeleaf Users Page");

            // model = table from usersPage
            model.addAttribute("usersTable", usersService.getUsers());
            return "usersPage";
        }


    @PostMapping("/login")
    public void postUsers(@RequestBody UsersDto dto) {
        usersService.add(dto);
    }

    @GetMapping("/{id}")
    public Users getById(@PathVariable(required = true) int id) {
        return usersService.getUsersById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) int id) {
        usersService.delete(id);
    }




}

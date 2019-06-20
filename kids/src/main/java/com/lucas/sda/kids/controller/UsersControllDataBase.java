package com.lucas.sda.kids.controller;

import com.lucas.sda.kids.model.Users;
import com.lucas.sda.kids.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usersInBase")
public class UsersControllDataBase {

    // folosim RestController doar pentru furnizari de frontEnd, altfel folosim Controller

        @Autowired
        UsersService usersService;

        @GetMapping
        public List<Users> getUsers() {

            return usersService.getUsers();
        }
    }


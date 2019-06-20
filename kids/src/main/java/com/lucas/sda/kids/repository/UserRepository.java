package com.lucas.sda.kids.repository;


import com.lucas.sda.kids.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Integer>{


}

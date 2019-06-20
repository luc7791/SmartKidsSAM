package com.lucas.sda.kids.service;

import com.lucas.sda.kids.model.Users;
import com.lucas.sda.kids.model.UsersDto;
import com.lucas.sda.kids.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UsersService {

    @Autowired
    UserRepository repository;

    private Users toEntity (UsersDto dto){
        Users entity = new Users();
        entity.setUserName(dto.getUserName());
        entity.setPasswrd(dto.getPasswrd());
        entity.setUserName(dto.getEmail());
        entity.setvBucks(dto.getvBucks());

        return entity;
    }

    public void add (UsersDto dto){
        repository.save(toEntity(dto));
    }

    public void delete (int id){
        repository.deleteById(id);
    }

    public List<Users> getUsers(){
        return (List<Users>) repository.findAll();
    }

    public Users getUsersById(int id){
        Optional<Users> optionalUsers=repository.findById(id);
        return optionalUsers.orElseThrow(() -> new UserNotFoundException("Couldn't find a User with id: " + id));
    }


}

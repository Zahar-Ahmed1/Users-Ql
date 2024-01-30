package com.example.controlle.web;

import com.example.controlle.dao.entities.User;
import com.example.controlle.service.dtos.UserDTO;
import com.example.controlle.service.UserManagerAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller

public class UserGraphQLController  {

    @Autowired
    private UserManagerAction userManagerAction;

    @QueryMapping
    public List<UserDTO> getUserByEmail(@Argument String email){
        return userManagerAction.getUserByEmail(email);
    }

    @QueryMapping
    public UserDTO getUserByDateNaissance(@Argument String date){
        return userManagerAction.getUserByDateNaissance(date);
    }

    @QueryMapping
    public UserDTO saveUser(@Argument("user") User user){
        return userManagerAction.saveUser(user);
    }

    @QueryMapping
    public UserDTO deleteUser(Long id){
        return userManagerAction.deleteUser(id);
    }

}

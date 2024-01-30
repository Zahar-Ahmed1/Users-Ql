package com.example.controlle.service;

import com.example.controlle.dao.entities.User;
import com.example.controlle.dao.repositories.UserRepository;
import com.example.controlle.service.dtos.UserDTO;
import com.example.controlle.service.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component

public class UserManagerAction implements UserManager{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;



    public List<UserDTO> getUserByEmail(String email){
        User user = userRepository.getUserByEmail(email);
        UserDTO userDTO=userMapper.fromUserToUserDto(user);
        return userDTO;
    }

    @Override
    public List<UserDTO> getUserByIdAndName(Long id, String name) {
        return null;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteCar(Long id) {
        return null;
    }

    public UserDTO getUserByDateNaissance(String date_Naissance){




        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate;
        try {
            parsedDate = sdf.parse(date_Naissance);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd");
        }
        User user = userRepository.getUserByDate_Naissance(parsedDate);
        UserDTO userDTO=userMapper.fromUserToUserDto(user);
        return userDTO;
    }
    public UserDTO saveUser(User user){

        Optional<UserDTO> userDTO = Optional.ofNullable((UserDTO) getUserByEmail(user.getEmail()));
        if (userDTO.isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }
        User user1 = userRepository.save(user);
        userDTO = Optional.ofNullable(userMapper.fromUserToUserDto(user1));
        return userDTO.get();

    }
    public UserDTO deleteUser(Long id){
        User user = userRepository.findById(id).orElseThrow(() ->  new  RuntimeException(String.format("User %s not found",id)));
        userRepository.delete(user);
        UserDTO userDTO=userMapper.fromUserToUserDto(user);
        return userDTO;
    }
}


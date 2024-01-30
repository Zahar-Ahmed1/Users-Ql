package com.example.controlle.service;
import com.example.controlle.dao.entities.User;

import com.example.controlle.service.dtos.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserManager {

    public List<UserDTO> getUserByEmail(String email);
    public List<UserDTO> getUserByIdAndName(Long id, String name);
    public UserDTO saveUser(UserDTO userDTO);
    public UserDTO deleteCar(Long id);
}

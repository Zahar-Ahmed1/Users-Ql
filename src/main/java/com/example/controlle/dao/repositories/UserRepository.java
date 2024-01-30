package com.example.controlle.dao.repositories;


import com.example.controlle.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User,Long> {

    public User getUserByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.date_Naissance = :date")
    public User getUserByDate_Naissance(@Param("date") Date date);

}

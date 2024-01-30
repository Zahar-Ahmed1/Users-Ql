package com.example.controlle;

import com.example.controlle.dao.entities.User;
import com.example.controlle.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControlleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlleApplication.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository userRepository){
		return args -> {
			List<User> users=List.of(
					User.builder().name("Ahmed1").email("Ahmed1@gmail.com").date_Naissance(new Date()).password("1234").build(),
					User.builder().name("Ahmed2").email("Ahmed2@gmail.com").date_Naissance(new Date()).password("1234").build(),
					User.builder().name("Ahmed3").email("Ahmed3@gmail.com").date_Naissance(new Date()).password("1234").build(),
					User.builder().name("Ahmed4").email("Ahmed4@gmail.com").date_Naissance(new Date()).password("1234").build()
			);

			users=userRepository.saveAll(users);
			users=userRepository.saveAll(users);
		};
	}

}

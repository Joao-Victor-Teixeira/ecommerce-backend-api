package com.joaodev.ecommerce.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodev.ecommerce.entities.User;
import com.joaodev.ecommerce.repositories.UserRepository;

@Configuration

public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }


}

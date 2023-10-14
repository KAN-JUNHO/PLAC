package com.example.plac.service;

import com.example.plac.DTO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.plac.repository.UserRepository;

import java.util.Random;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        String randomSuffix = generateRandomSuffix();

        User newUser = User.builder()
                .userId(user.getUserId())
                .nickname(user.getNickname() + randomSuffix)
                .email(user.getEmail())
                .build();

        return userRepository.save(newUser);
    }

    private String generateRandomSuffix() {
        Random random = new Random();
        int randomNum = 1000 + random.nextInt(9000);  // Generates a random number between 1000 and 9999
        return String.valueOf(randomNum);
    }
}

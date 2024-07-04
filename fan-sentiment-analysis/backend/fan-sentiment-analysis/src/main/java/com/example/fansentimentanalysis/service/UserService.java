package com.example.fansentimentanalysis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fansentimentanalysis.model.User;
import com.example.fansentimentanalysis.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int id, User userDetails) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setUsername(userDetails.getUsername());
            user.setPasswordHash(userDetails.getPasswordHash());
            user.setEmail(userDetails.getEmail());
            user.setRole(userDetails.getRole());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}

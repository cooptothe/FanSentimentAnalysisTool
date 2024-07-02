package com.example.fansentimentanalysis.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;

import com.example.fansentimentanalysis.model.User;
import com.example.fansentimentanalysis.repository.UserRepository;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    @WithMockUser
    public void testSaveUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        userService.saveUser(user);
        // add assertions as needed
    }
}

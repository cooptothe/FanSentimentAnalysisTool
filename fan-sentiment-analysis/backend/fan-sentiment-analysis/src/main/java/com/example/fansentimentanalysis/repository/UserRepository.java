package com.example.fansentimentanalysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fansentimentanalysis.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Define any custom query methods if needed
}

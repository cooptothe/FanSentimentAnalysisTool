// UserRepository.java
package com.example.fansentimentanalysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fansentimentanalysis.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

package com.example.fansentimentanalysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fansentimentanalysis.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
    // Define any custom query methods if needed
}

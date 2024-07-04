package com.example.fansentimentanalysis.repository;

import com.example.fansentimentanalysis.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Integer> {
    // Define any custom query methods if needed
}

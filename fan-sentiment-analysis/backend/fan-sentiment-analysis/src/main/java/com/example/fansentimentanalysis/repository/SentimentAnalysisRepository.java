package com.example.fansentimentanalysis.repository;

import com.example.fansentimentanalysis.model.SentimentAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentAnalysisRepository extends JpaRepository<SentimentAnalysis, Integer> {
    // Define any custom query methods if needed
}

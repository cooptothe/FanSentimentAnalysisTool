package com.example.fansentimentanalysis.controller;

import com.example.fansentimentanalysis.model.SentimentAnalysis;
import com.example.fansentimentanalysis.repository.SentimentAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sentiment")
public class SentimentAnalysisController {

    @Autowired
    private SentimentAnalysisRepository sentimentAnalysisRepository;

    @GetMapping
    public List<SentimentAnalysis> getAllSentimentAnalyses() {
        return sentimentAnalysisRepository.findAll();
    }

    @GetMapping("/{id}")
    public SentimentAnalysis getSentimentAnalysisById(@PathVariable("id") int id) {
        return sentimentAnalysisRepository.findById(id).orElse(null);
    }

    @PostMapping
    public SentimentAnalysis createSentimentAnalysis(@RequestBody SentimentAnalysis sentimentAnalysis) {
        return sentimentAnalysisRepository.save(sentimentAnalysis);
    }

    @PutMapping("/{id}")
    public SentimentAnalysis updateSentimentAnalysis(@PathVariable("id") int id, @RequestBody SentimentAnalysis sentimentAnalysis) {
        if (sentimentAnalysisRepository.existsById(id)) {
            sentimentAnalysis.setId(id);
            return sentimentAnalysisRepository.save(sentimentAnalysis);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteSentimentAnalysis(@PathVariable("id") int id) {
        sentimentAnalysisRepository.deleteById(id);
    }
}

package com.example.fansentimentanalysis.controller;

import com.example.fansentimentanalysis.model.Platform;
import com.example.fansentimentanalysis.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platforms")
public class PlatformController {

    @Autowired
    private PlatformRepository platformRepository;

    @GetMapping
    public List<Platform> getAllPlatforms() {
        return platformRepository.findAll();
    }

    @GetMapping("/{id}")
    public Platform getPlatformById(@PathVariable("id") int id) {
        return platformRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Platform createPlatform(@RequestBody Platform platform) {
        return platformRepository.save(platform);
    }

    @PutMapping("/{id}")
    public Platform updatePlatform(@PathVariable("id") int id, @RequestBody Platform platform) {
        if (platformRepository.existsById(id)) {
            platform.setId(id);
            return platformRepository.save(platform);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletePlatform(@PathVariable("id") int id) {
        platformRepository.deleteById(id);
    }
}

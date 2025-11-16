package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // allow React frontend
public class AIController {

    @PostMapping("/prompt")
    public String getAIResponse(@RequestBody String userInput) {
        return "🤖 CodeSage AI says: This is a placeholder response for - " + userInput;
    }
}

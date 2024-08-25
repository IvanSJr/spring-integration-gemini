package com.github.ivansjr.integrationgeminispring.controller;

import com.github.ivansjr.integrationgeminispring.service.GeminiPromptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeminiPromptController {

    @Autowired
    private GeminiPromptService geminiPromptService;

    @GetMapping("/gemini-prompt")
    public String getResponse(@RequestParam String prompt, @RequestParam String geminiKey) {
        return geminiPromptService.callApi(prompt, geminiKey);
    }

}

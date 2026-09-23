package com.javaupskilling.languagetool.controllers;

import com.javaupskilling.languagetool.dto.TranslationRequest;
import com.javaupskilling.languagetool.services.TranslationService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TranslationController {

    private TranslationService translationService;

    public TranslationController(TranslationService translationService) {
        this.translationService = translationService;
    }

    @PostMapping("/translate")
    public String translate(@RequestBody TranslationRequest request) {
        return translationService.translate(request);
    }
}

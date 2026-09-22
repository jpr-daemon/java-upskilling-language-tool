package com.javaupskilling.languagetool.services;

import com.javaupskilling.languagetool.dto.TranslationRequest;
import org.springframework.stereotype.Component;

@Component
public class TranslationService {

    public String translate(TranslationRequest request) {
        return String.format(
                "Stub Translation [%s -> %s]: %s",
                request.sourceLanguage(),
                request.targetLanguage(),
                request.text()
        );
    }
}

package com.javaupskilling.languagetool.dto;

public record TranslationRequest(
        String sourceLanguage,
        String targetLanguage,
        String text
) {
}

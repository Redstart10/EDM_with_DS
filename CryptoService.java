package com.example.edms.dto;

import jakarta.validation.constraints.NotBlank;

public record SendDocumentRequest(@NotBlank String recipientUsername) {}

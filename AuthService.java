package com.example.edms.dto;

import com.example.edms.entity.Document;
import com.example.edms.entity.DocumentStatus;
import java.time.LocalDateTime;

public record DocumentResponse(
        Long id,
        String title,
        String content,
        String contentHash,
        DocumentStatus status,
        String author,
        String recipient,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    public static DocumentResponse from(Document d) {
        return new DocumentResponse(
                d.getId(),
                d.getTitle(),
                d.getContent(),
                d.getContentHash(),
                d.getStatus(),
                d.getAuthor().getUsername(),
                d.getRecipient() == null ? null : d.getRecipient().getUsername(),
                d.getCreatedAt(),
                d.getUpdatedAt()
        );
    }
}

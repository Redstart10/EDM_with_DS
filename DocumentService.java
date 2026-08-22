package com.example.edms.dto;

import com.example.edms.entity.DocumentHistory;
import java.time.LocalDateTime;

public record HistoryResponse(
        Long id,
        Long documentId,
        String actor,
        String action,
        String details,
        LocalDateTime createdAt
) {
    public static HistoryResponse from(DocumentHistory h) {
        return new HistoryResponse(
                h.getId(),
                h.getDocument().getId(),
                h.getActor().getUsername(),
                h.getAction(),
                h.getDetails(),
                h.getCreatedAt()
        );
    }
}

package com.example.edms.dto;

import com.example.edms.entity.DigitalSignature;
import java.time.LocalDateTime;

public record SignatureResponse(
        Long id,
        Long documentId,
        String signer,
        String algorithm,
        String documentHash,
        String signatureValue,
        LocalDateTime signedAt
) {
    public static SignatureResponse from(DigitalSignature s) {
        return new SignatureResponse(
                s.getId(),
                s.getDocument().getId(),
                s.getSigner().getUsername(),
                s.getAlgorithm(),
                s.getDocumentHash(),
                s.getSignatureValue(),
                s.getSignedAt()
        );
    }
}

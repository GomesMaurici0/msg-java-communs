package com.m_m.msgjavacommuns.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public record ErrorResponse(List<Erro>errors) {
    public ResponseEntity<ErrorResponse> toResponseEntity(HttpStatus status) {
        return ResponseEntity.status(status).body(this);
    }
}

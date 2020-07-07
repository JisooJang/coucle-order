package com.example.coucleorder.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    private LocalDateTime createdAt, lastUpdatedAt;
}

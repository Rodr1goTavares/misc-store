package com.store.core.domain.entity;

public record Item(
        Long id,
        String name,
        String description,
        String imagePath,
        String category,
        double price,
        boolean available,
        String link
) {}

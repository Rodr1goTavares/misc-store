package com.store.infra.api.controller;

import com.store.core.domain.entity.Item;
import com.store.core.domain.usecases.GetItemUseCase;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final GetItemUseCase getItemUseCase;

    public ItemController(GetItemUseCase getItemUseCase) {
        this.getItemUseCase = getItemUseCase;
    }

    @GetMapping
    public ResponseEntity<?> getItems(Pageable pageable) {
        Page<Item> itemsPage = (Page<Item>) this.getItemUseCase.getAll(pageable);
        return ResponseEntity.ok().body(itemsPage);
    }
}

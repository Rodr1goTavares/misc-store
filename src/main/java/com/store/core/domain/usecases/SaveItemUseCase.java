package com.store.core.domain.usecases;

import com.store.core.domain.entity.Item;
import com.store.core.gateway.ItemPersistenceGateway;

public class SaveItemUseCase {

    private final ItemPersistenceGateway itemPersistenceGateway;

    public SaveItemUseCase(ItemPersistenceGateway itemPersistenceGateway) {
        this.itemPersistenceGateway = itemPersistenceGateway;
    }

    public Item save(Item item) {
        return this.itemPersistenceGateway.save(item);
    }

}

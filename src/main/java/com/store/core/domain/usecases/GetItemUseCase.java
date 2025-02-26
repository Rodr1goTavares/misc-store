package com.store.core.domain.usecases;

import com.store.core.domain.entity.Item;
import com.store.core.gateway.ItemPersistenceGateway;

public class GetItemUseCase {

    private final ItemPersistenceGateway itemPersistenceGateway;

    public GetItemUseCase(ItemPersistenceGateway itemPersistenceGateway) {
        this.itemPersistenceGateway = itemPersistenceGateway;
    }

    public Item getById(Long id) {
        return this.itemPersistenceGateway.getById(id);
    }

}

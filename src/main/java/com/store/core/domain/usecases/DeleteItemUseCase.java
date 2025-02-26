package com.store.core.domain.usecases;

import com.store.core.gateway.ItemPersistenceGateway;

public class DeleteItemUseCase {

    private final ItemPersistenceGateway itemPersistenceGateway;

    public DeleteItemUseCase(ItemPersistenceGateway itemPersistenceGateway) {
        this.itemPersistenceGateway = itemPersistenceGateway;
    }

    public void delete(Long id) {
        this.itemPersistenceGateway.delete(id);
    }

}

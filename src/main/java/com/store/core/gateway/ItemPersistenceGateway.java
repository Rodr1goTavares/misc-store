package com.store.core.gateway;

import com.store.core.domain.entity.Item;


public interface ItemPersistenceGateway<I extends Iterable<Item>, P> {

    Item save(Item item);

    Item getById(Long id);

    I getAll(P page);

    void delete(Long id);

}

package com.store.core.gateway;

import com.store.core.domain.entity.Item;


public interface ItemPersistenceGateway {

    Item save(Item item);

    Item getById(Long id);

    void delete(Long id);

}

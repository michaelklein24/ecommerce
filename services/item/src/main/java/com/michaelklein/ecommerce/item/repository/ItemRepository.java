package com.michaelklein.ecommerce.item.repository;

import com.michaelklein.ecommerce.item.model.ItemModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<ItemModel, String> {
}

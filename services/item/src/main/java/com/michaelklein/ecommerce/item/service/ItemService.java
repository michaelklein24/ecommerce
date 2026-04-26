package com.michaelklein.ecommerce.item.service;

import com.michaelklein.ecommerce.item.model.ItemModel;
import com.michaelklein.ecommerce.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepo;

    public List<ItemModel> getAllItems() {
        return itemRepo.findAll();
    }
}

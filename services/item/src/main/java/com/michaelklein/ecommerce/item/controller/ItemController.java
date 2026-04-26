package com.michaelklein.ecommerce.item.controller;

import com.michaelklein.ecommerce.item.controller.model.GetItemsRequest;
import com.michaelklein.ecommerce.item.controller.model.GetItemsResponse;
import com.michaelklein.ecommerce.item.model.ItemModel;
import com.michaelklein.ecommerce.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping()
    public GetItemsResponse getItems(@RequestBody GetItemsRequest request) {
        List<ItemModel> items = itemService.getAllItems();
        return new GetItemsResponse.Builder().items(items).build();
    }

    @GetMapping("/{id}")
    public GetItemsResponse getItemById(@PathVariable String id) {
        return null;
    }
}

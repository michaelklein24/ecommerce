package com.michaelklein.ecommerce.item.controller.model;

import com.michaelklein.ecommerce.item.model.ItemModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GetItemsResponse {
    private List<ItemModel> items = new ArrayList<>();

    public GetItemsResponse(Builder builder)
    {
        this.items = builder.items;
    }

    public static class Builder {
        private List<ItemModel> items;

        public  Builder items(List<ItemModel> items) {
            this.items = items;
            return this;
        }

        public GetItemsResponse build() {
            return new GetItemsResponse(this);
        }
    }
}

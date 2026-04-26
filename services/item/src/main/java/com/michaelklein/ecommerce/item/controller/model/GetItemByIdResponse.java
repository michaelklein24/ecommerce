package com.michaelklein.ecommerce.item.controller.model;

import com.michaelklein.ecommerce.item.model.ItemModel;
import lombok.Data;

@Data
public class GetItemByIdResponse {
    private ItemModel itemModel;
}

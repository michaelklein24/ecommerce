package com.michaelklein.ecommerce.item.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "items")
public class ItemModel {
    @Id
    private String id;

    private String name;
    private String description;
    private PriceModel price;
}

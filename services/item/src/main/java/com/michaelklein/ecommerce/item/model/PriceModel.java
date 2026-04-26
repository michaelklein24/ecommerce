package com.michaelklein.ecommerce.item.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceModel {
    private String currencyUnit;
    private BigDecimal amount;
}

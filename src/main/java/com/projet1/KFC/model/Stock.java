package com.projet1.KFC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private UUID id;
    private UUID idProduct;
    private BigDecimal quantity;
    private LocalDateTime lastUpdated;
}

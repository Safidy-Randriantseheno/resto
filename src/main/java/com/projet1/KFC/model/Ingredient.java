package com.projet1.KFC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    private UUID id;
    private String name;
    private Double quantity;
    private LocalDateTime supplyDate;
    private Double currentUnitPrice;
}

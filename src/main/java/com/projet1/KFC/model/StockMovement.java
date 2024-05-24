package com.projet1.KFC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMovement {
    private UUID id;
    private LocalDate dateOfMovement;
    private String movementType;
    private Double quantity;
}

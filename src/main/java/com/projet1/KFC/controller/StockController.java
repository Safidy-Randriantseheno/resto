package com.projet1.KFC.controller;

import com.projet1.KFC.model.Ingredient;
import com.projet1.KFC.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ingredient")
@AllArgsConstructor
public class StockController {
    private final StockService stockService;
    @PutMapping("/supply")
    public ResponseEntity<String> supplyIngredient(
            @RequestBody UUID ingredient,
            @RequestParam LocalDateTime supplyDate,
            @RequestParam Double supplyQuantity
            ){
        boolean success = stockService.supplyIngredient(ingredient,supplyDate,supplyQuantity);
        if (success) {
            return ResponseEntity.ok("Stock mis à jour avec succès");
        } else {
            return ResponseEntity.badRequest().body("Échec de la mise à jour du stock");
        }
    }
}

package com.projet1.KFC.service;

import com.projet1.KFC.model.Ingredient;
import com.projet1.KFC.repository.IngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class StockService {
    private final IngredientRepository ingredientRepository;
    public boolean supplyIngredient(UUID ingredientId, LocalDateTime supplyDate, Double supplyQuantity){
        Ingredient ingredient = ingredientRepository.findById(ingredientId);
        if(ingredient == null){
            return false;
        }
        ingredient.setQuantity(ingredient.getQuantity() + supplyQuantity);
        ingredient.setSupplyDate(supplyDate);
        ingredientRepository.save(ingredient);
        return true;
    }
}

package com.projet1.KFC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class IngredientMenu {
    private List<Ingredient> ingredientId;
    private Menu menuId;
    private Double quantity;
    private Unit unitId;
    private Price price;
}

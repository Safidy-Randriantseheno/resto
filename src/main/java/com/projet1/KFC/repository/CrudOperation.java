package com.projet1.KFC.repository;

import com.projet1.KFC.model.Ingredient;

import java.util.List;

public interface CrudOperation<T> {
    public List<T> findAll();
    public List<T> saveAll(List<T> toSave);
    public T save(T toSave);
    public T update(T toUpdate);
    T delete(T toDelete);

    Ingredient save(Ingredient toSave);
}

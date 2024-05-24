package com.projet1.KFC.repository;

import com.projet1.KFC.DataBaseConnection;
import com.projet1.KFC.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Repository
public class IngredientRepository implements CrudOperation<Ingredient>{
    String userName = System.getenv("DB_USERNAME");
    String password = System.getenv("DB_PASSWORD");
    String databaseName = System.getenv("DB_NAME");
    DataBaseConnection dbConnection = new DataBaseConnection(userName, password, databaseName);
    Connection conn = dbConnection.getConnection();
    @Override
    public List<Ingredient> findAll() {
        return null;
    }

    public Ingredient findById(UUID idIngredient) {
        String query = "SELECT * FROM ingredient WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setObject(1, idIngredient);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Ingredient ingredient = new Ingredient();
                    ingredient.setId(UUID.fromString(rs.getString("id")));
                    ingredient.setName(rs.getString("nam"));
                    ingredient.setQuantity(rs.getDouble("quantity"));
                    ingredient.setSupplyDate(rs.getObject("supply_date", LocalDate.class).atStartOfDay());
                    return ingredient;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Ingredient> saveAll(List<Ingredient> toSave) {
        return null;
    }

    @Override
    public Ingredient save(Ingredient toSave) {
        String query = "UPDATE ingredient SET nom = ?, quantite = ?, date_approvisionnement = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, toSave.getName());
            pstmt.setDouble(2, toSave.getQuantity());
            pstmt.setObject(3, toSave.getSupplyDate());
            pstmt.setObject(4, toSave.getId());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                return toSave;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Ingredient update(Ingredient toUpdate) {
        return null;
    }

    @Override
    public Ingredient delete(Ingredient toDelete) {
        return null;
    }
}


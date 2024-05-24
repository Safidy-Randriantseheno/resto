CREATE TABLE Ingredient (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantity DOUBLE PRECISION NOT NULL,
    supply_date TIMESTAMP NOT NULL,
    current_unit_price DOUBLE PRECISION NOT NULL
);

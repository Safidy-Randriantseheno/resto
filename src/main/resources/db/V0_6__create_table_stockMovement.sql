CREATE TABLE stock_movement (
    id UUID PRIMARY KEY,
    date_of_movement DATE NOT NULL,
    movement_type VARCHAR(255) NOT NULL,
    quantity DOUBLE PRECISION NOT NULL
);

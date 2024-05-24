CREATE TABLE stock (
    id UUID PRIMARY KEY,
    id_product UUID NOT NULL,
    quantity NUMERIC(19, 2) NOT NULL,
    last_updated TIMESTAMP NOT NULL
);


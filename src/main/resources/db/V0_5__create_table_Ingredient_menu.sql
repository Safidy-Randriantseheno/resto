CREATE TABLE ingredient_menu (
    id UUID PRIMARY KEY,
    ingredient_id UUID NOT NULL,
    menu_id UUID NOT NULL,
    quantity DOUBLE PRECISION NOT NULL,
    unit_id UUID NOT NULL,
    price_id UUID NOT NULL,
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id),
    FOREIGN KEY (menu_id) REFERENCES menu(id),
    FOREIGN KEY (unit_id) REFERENCES unit(id),
    FOREIGN KEY (price_id) REFERENCES price(id)
);

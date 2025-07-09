package ru.yandex.praktikum.model.constants.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    Food[] shopingCart = {};

    public ShoppingCart(Food[] products) {
        Food[] shopingCart = {};
    }

    public int amountWithoutDiscount() {
        return 0;
    }

    public int amountWithDiscount() {
        return 0;
    }

    public int amountVeganProductsWithoutDiscount() {
        return 0;
    }

}

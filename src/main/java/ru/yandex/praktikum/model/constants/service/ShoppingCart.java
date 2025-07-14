package ru.yandex.praktikum.model.constants.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    Food[] shopingCart = {};

    public ShoppingCart(Food[] products) {
        this.shopingCart = products;
    }

    public double amountWithoutDiscount() {
        double amount = 0;
        for (int i = 0; i < shopingCart.length; i++) {
            amount += shopingCart[i].getPrice();
        }
        return amount;
    }

    public double amountWithDiscount() {
        double amount = 0;
        for (int i = 0; i < shopingCart.length; i++) {
            amount += shopingCart[i].getPrice() - shopingCart[i].getDiscount();
        }
        return amount;
    }

    public double amountVeganProductsWithoutDiscount() {
        double amount = 0;
        for (int i = 0; i < shopingCart.length; i++) {
            if (shopingCart[i].isVegetarian()) {
                amount += shopingCart[i].getPrice();
            }
        }
        return amount;
    }
}

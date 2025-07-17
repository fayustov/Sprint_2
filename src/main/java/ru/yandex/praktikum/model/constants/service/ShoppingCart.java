package ru.yandex.praktikum.model.constants.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    Food[] shoppingCart = {};

    public ShoppingCart(Food[] products) {
        this.shoppingCart = products;
    }

    public double amountWithoutDiscount() {
        double amount = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            amount += shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
        }
        return amount;
    }

    public double amountWithDiscount() {
        double amount = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            amount += (shoppingCart[i].getPrice() - shoppingCart[i].getDiscount()) * shoppingCart[i].getAmount();
        }
        return amount;
    }

    public double amountVeganProductsWithoutDiscount() {
        double amount = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].isVegetarian()) {
                amount += shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
            }
        }
        return amount;
    }
}

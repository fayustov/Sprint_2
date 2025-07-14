package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_PERCENTAGE;

public abstract class Food implements Discountable {

    int amount;
    double price;
    boolean isVegetarian;

    public Food() {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

}

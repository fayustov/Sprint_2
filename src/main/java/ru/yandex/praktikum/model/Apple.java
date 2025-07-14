package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Colour.RED;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_PERCENTAGE;

public class Apple extends Food {

    String color;

    public Apple(int amount, int price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        isVegetarian = true;

    }

    public double getDiscount() {
        if (color.equals(RED)) {
            return this.price / 100 * DISCOUNT_PERCENTAGE;
        }
        return 0;
    }

}

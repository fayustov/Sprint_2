package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Colour.RED;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_PERCENTAGE;

public class Apple extends Food {

    String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    public double getDiscount() {
        if (color.equals(RED)) {
            return this.price / 100 * DISCOUNT_PERCENTAGE;
        }
        return 0;
    }

}

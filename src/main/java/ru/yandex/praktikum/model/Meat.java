package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_PERCENTAGE;

public class Meat extends Food {

    public Meat(int amount, int price) {
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {

        return 0;

    }
}

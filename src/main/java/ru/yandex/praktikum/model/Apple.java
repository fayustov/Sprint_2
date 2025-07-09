package ru.yandex.praktikum.model;

public class Apple extends Food {

    String color;

    public Apple(int amount, int price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        isVegetarian = true;

    }

    public int getDiscount() {
        if (color.equals("red")) {
            return 60;
        }
        return 0;
    }

}

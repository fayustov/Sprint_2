package ru.yandex.praktikum.model;

public class Meat extends  Food {

    public Meat(int amount, int price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }

}

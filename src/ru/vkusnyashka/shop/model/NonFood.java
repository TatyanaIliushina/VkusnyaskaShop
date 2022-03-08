package ru.vkusnyashka.shop.model;

public abstract class NonFood extends Product { // абстрактный класс не продукты питания, наследуемый от продукта

    public NonFood(String name, int price, String status, double date, int barCode, double expirationDate) {
        super(name, price, status, date, barCode, expirationDate);
    }
}

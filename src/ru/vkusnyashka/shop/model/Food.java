package ru.vkusnyashka.shop.model;

public abstract class Food extends Product { // абстрактный класс еда наследуемый от продукта
    public Food(String name, int price, String status, double date, int barCode, double expirationDate) {
        super(name, price, status, date, barCode, expirationDate);
    }

    public void checkExpirationDate() { // логика проверки даты изготовления, если , то
    //if (expirationDate < ) реализовать сревнение по датам
    }


}

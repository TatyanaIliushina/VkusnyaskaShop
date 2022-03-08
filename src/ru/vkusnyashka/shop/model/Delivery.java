package ru.vkusnyashka.shop.model;

public class Delivery { // доставка
    public int idCustom;
    public double deliveryDate;
    public String deliveryAdress;


    public Delivery(int idCustom, double deliveryDate, String deliveryAdress) {
        this.idCustom = idCustom;
        this.deliveryDate = deliveryDate;
        this.deliveryAdress = deliveryAdress;

    }
}

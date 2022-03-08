package ru.vkusnyashka.storage;

public class Storage { // склад
    // здесь должна быть реализация очереди. Первый поступил на склад, первый попал в магазин
    public String name; //назнание склада
    public String adress;


    public Storage(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }


    public Storage() {

    }
}

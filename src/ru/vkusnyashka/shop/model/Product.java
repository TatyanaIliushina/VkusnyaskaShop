package ru.vkusnyashka.shop.model;

public abstract class Product {
    public String name;
    public int price;
    public String status;
    public double date; // Дата изготовления
    public int barCode;
    public double expirationDate; // срок годности, годен до

    public Product(String name, int price, String status, double date, int barCode, double expirationDate) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.date = date;
        this.barCode = barCode;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public double getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(double expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void putInBasket(Product product) {
        if (product.getStatus() == "В наличии") {
            System.out.println("Товар " + product.getName() + " перемещен в корзину");
            product.setStatus("Выбран");
            //Object order = null;
            //order.addToOrder(product);
        }
        else {
            System.out.println("Товара " + product.getName() + " нет в наличии.");
        }

    }
    public void receivesProduct(Product product){
        boolean clientPayForProduct = true;
        if (clientPayForProduct)
            product.getStatus();

    }
}

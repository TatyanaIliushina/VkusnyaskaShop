package ru.vkusnyashka.shop.model;

public class Client {

    private String registrationNumber;
    private int cardNumber;  // в случае, если клиент уже регистрировался на сайте
    private Client Client;
    private boolean clientSelectsProduct;

    // не хватает механизма регистрации, дополнить

    Client(String registrationNumber, int cardNumber) {
        this.registrationNumber = registrationNumber;
        this.cardNumber = cardNumber;
    }

    public void clientLoginOnCite(Client client) {

    }

    {

    }

    public void clientSelectsProduct(Product product){
        Basket basket = new Basket() {
            @Override
            public void productNumberInBasket() {

            }
        };
        basket.addProduct(product);
        if (clientSelectsProduct)
            System.out.println(Client + " выбрал " + product + " и положил его в корзину");

    }

    public void clientPayForProduct(Product product){
        boolean clientPayForProduct = true;
        if (clientPayForProduct);
        System.out.println(Client + " оплатил " + product);

    }

}

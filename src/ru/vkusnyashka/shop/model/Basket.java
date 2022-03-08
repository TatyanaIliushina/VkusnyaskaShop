package ru.vkusnyashka.shop.model;

public abstract class Basket<i,j> {
    public void addProduct(Product product) {
    } //продукты выбираются и кладутся в карзину

    public abstract void productNumberInBasket();


    private int i;
    private final int basket = i;
    ///for (i = 1; i <= 20; i++)


        //int i = 0;
        //int productNumberInBasket = i;     // подсчет позиций в корзине
        //int j;     //кол-во шт 1 позиции в корзине
        //for (i = 1; i <= 20; i++)
        //private static final int[i] basket = ;

        {
            int productNumberInBasket = i;
            //Basket.basket[i] = i + 1;

        }


        /*for (int j = 1; j <= 5; j++) {
            int multiplay = i * j;//-кол-во товара в корзине

            System.out.println(multiplay);
        }
    }

         */
}

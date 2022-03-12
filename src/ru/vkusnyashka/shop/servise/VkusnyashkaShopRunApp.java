package ru.vkusnyashka.shop.servise;

import ru.vkusnyashka.shop.model.Product;
import ru.vkusnyashka.storage.Storage;

import java.util.ArrayList;
import java.util.List;


public class VkusnyashkaShopRunApp {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++){
            new JThread("Поток номер" + i).start();
        }
    }
}
        /*List<Product> storeProductList;  // реализация ассортимента
        storeProductList = new ArrayList<Product>();
        Storage storage = new Storage();
    }

     */



    //void clientOnCite;
    // перед ним список продуктов
    // выбирает продукты, кладет из в корзину
    // перейти к оплате
    //оформить доставку (подтверждение доставки происходит в самой доставке




//}



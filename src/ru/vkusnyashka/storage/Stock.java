package ru.vkusnyashka.storage;

public interface Stock { // остатки на складе
    private static void main(String[] args) {
        int [] stock = new int[10]; //запас товара на складе
        for(int i=0; i<10; i++){
            stock[i] = i+1;
            System.out.println(stock[i]);
        }for (int i: stock){
            System.out.println(i);
        }
        String [] names = {"Order","Client","Product","Storage","Discounts"};
        int index=0;
        while (index < names.length){
            System.out.println(names[index]);
            index++;
        }
    }
}


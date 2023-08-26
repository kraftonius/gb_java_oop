package homework1;

import java.awt.desktop.UserSessionEvent;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Товары для животных");
        Category category2 = new Category("Хоз. товары");
        Category category3 = new Category("Канц. товары");

        Product product1 = new Product("Корм для кошек", 999, 4.5, category1);
        Product product2 = new Product("Корм для собак", 1999, 4.1, category1);
        Product product3 = new Product("Корм для попугаев", 269, 4.7, category1);
        Product product4 = new Product("Клетка для попугая", 3799.5, 5, category1);
        Product product5 = new Product("Лампочка Светодиодная E27", 281.10, 4.5, category2);
        Product product6 = new Product("Салфетка для стекла", 515.10, 3.9, category2);
        Product product7 = new Product("Коврик для ванной", 897.30, 3.6, category2);
        Product product8 = new Product("Тетрадь мягкая обложка", 29.90, 3.5, category3);
        Product product9 = new Product("Тетрадь твердая обложка", 99.90, 4.6, category3);
        Product product10 = new Product("Ручка шариковая", 19.90, 2.3, category3);
        Product product11 = new Product("Бумага А4 Пачка", 296, 5.0, category3);
        Product product12 = new Product("Карандаш", 15, 4.0, category3);

        product1.acceptGoods(10);
        product2.acceptGoods(10);
        product3.acceptGoods(5);
        product4.acceptGoods(2);
        product5.acceptGoods(10);
        product6.acceptGoods(10);
        product7.acceptGoods(10);
        product8.acceptGoods(20);
        product9.acceptGoods(20);
        product10.acceptGoods(20);
        product11.acceptGoods(20);
        product12.acceptGoods(20);

        User user1 = new User("Вася", "vasya123");
        User user2 = new User("Маша", "krasotka1995");
        User user3 = new User("Петя", "ajD2d0!23:0");
        User user4 = new User("Даша", "8888KotMurzik8888");

        user1.setPassword("vasya123","vasya1234","vasya1234");

        user1.addToBasket(product1, 2);
        user1.addToBasket(product5, 1);
        user1.addToBasket(product6, 1);
        user1.addToBasket(product7, 1);
        user1.addToBasket(product12, 1);

        user2.addToBasket(product2, 1);
        user2.addToBasket(product8, 3);
        user2.addToBasket(product9, 1);
        user2.addToBasket(product10, 2);

        user3.addToBasket(product3, 2);
        user3.addToBasket(product4, 1);
        user3.addToBasket(product9, 3);
        user3.addToBasket(product11, 4);

        System.out.println("--------");
        Category.printCategories();
        System.out.println("--------");
        Product.printProducts();
        System.out.println("--------");
        User.printPurchases();
        System.out.println("--------");


    }
}

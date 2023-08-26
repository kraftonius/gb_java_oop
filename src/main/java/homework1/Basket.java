package homework1;

import javax.swing.*;
import java.util.*;

public class Basket {
    protected Map<Product, Integer> products = new TreeMap<>();

    public Basket() {
    }

    /**
     *
     * @return товары в корзине и их количество
     * @apiNote метод возвразает содержимое корзины в виде текста
     */
    @Override
    public String toString() {
        List<List<String>> prodList = new ArrayList<>();
        for (Map.Entry<Product, Integer> x : products.entrySet()
        ) {
            List<String> tempList = new ArrayList<>();
            tempList.add(x.getKey().name);
            tempList.add(x.getValue().toString());
            prodList.add(tempList);
        }
        return "Basket{" +
                "products=" + prodList +
                '}';
    }
}
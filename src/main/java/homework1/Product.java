package homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product implements Comparable<Product> {
    protected static List<Product> products = new ArrayList<>();

    protected String name;
    protected double price;
    protected double rating;
    protected Category category;
    protected int quantity;

    public Product(String name, double price, double rating, Category category) {
        this.name = name;
        setPrice(price);
        setRating(rating);
        this.category = category;
        this.quantity = 0;
        products.add(this);
        category.addProduct(this);
    }

    public Product(String name, double price, Category category) {
        double rating = 5;
        new Product(name, price, rating, category);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getRating() {
        return this.rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            String eText = "Цена не может быть отрицательной";
            throw new IllegalArgumentException(eText);
        } else {
            this.price = price;
        }
    }

    public void setRating(double rating) {
        if (rating < 1 || rating > 5) {
            String eText = "Рейтинг не может быть меньше 1, больше 5";
            throw new IllegalArgumentException(eText);
        } else {
            this.rating = (double) Math.round(rating * 10) / 10;
        }
    }

    /**
     * @param quantity количество товара, которое нужно добавить
     * @apiNote Добавляет количество товара на склад
     */
    public void acceptGoods(int quantity) {
        this.quantity += quantity;
    }

    /**
     * @apiNote Выводит все продкуты магазина с ценой, рейтингом и категорией
     */
    public static void printProducts() {
        for (Product product : Product.products
        ) {
            System.out.println(product);
        }
    }

    @Override
    public int compareTo(Product otherProduct) {
        return this.name.compareTo(otherProduct.getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", category='" + category.name + '\'' +
                ", remains='" + quantity + '\'' +
                '}';
    }
}

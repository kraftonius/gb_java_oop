package homework1;

import java.util.*;

public class User {
    protected static List<User> users = new ArrayList<>();
    protected String name;
    protected String password;
    protected Basket basket;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.basket = new Basket();
        users.add(this);
    }

    public String getName() {
        return name;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param oldPassword  Старый пароль
     * @param newPassword1 Новый пароль
     * @param newPassword2 Новый пароль повторный ввод
     * @apiNote Устанавливает новый пароль
     */
    public void setPassword(String oldPassword, String newPassword1, String newPassword2) {
        if (!Objects.equals(oldPassword, this.password)) {
            throw new IllegalArgumentException("Неверный действующий пароль!");
        } else if (!Objects.equals(newPassword1, newPassword2)) {
            throw new IllegalArgumentException("Новый пароль и Подтверждение Нового пароля не совпадают!");
        } else if (Objects.equals(oldPassword, newPassword1)) {
            throw new IllegalArgumentException("Новый пароль не может совпадать с действующим!");
        } else {
            this.password = newPassword1;
            System.out.println("Пароль для user '" + this.name + "' успешно изменен!");
        }
    }

    public void addToBasket(Product product, int quantity) {
        if (product.quantity < quantity) {
            throw new IllegalArgumentException("Не хватает товара: " + product.name);
        } else {
            if (this.basket.products.containsKey(product)) {
                this.basket.products.replace(product, this.basket.products.get(product) + quantity);
            } else {
                this.basket.products.put(product, quantity);
            }
            product.quantity -= quantity;
        }
    }

    /**
     * @apiNote Выводит покупки всех пользователей
     */
    public static void printPurchases() {
        for (User x : users
        ) {
            System.out.print(x.name + " Купил(а): ");
            if (x.basket.products.size() != 0) {
                for (Map.Entry<Product, Integer> entry : x.basket.products.entrySet()) {
                    System.out.print(entry.getKey().name + " : " + entry.getValue() + " шт. ");
                }
            } else {
                System.out.print("ничего");
            }
            System.out.print("\n");
        }
    }

    @Override
    public String toString() {

        return "User{" +
                "name='" + name + '\'' +
                ", basket=" + basket +
                '}';
    }
}

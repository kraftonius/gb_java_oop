package homework1;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Category {
    protected static List<Category> categories = new ArrayList<>();
    protected String name;
    protected List<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
        categories.add(this);
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return список товаров Категории
     */
    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param product продукт, который добавится
     * @apiNote добавляет новый продукт в список продуктов категории.
     * Обязательно использовать в конструкторе класса Product
     */
    protected void addProduct(Product product) {
        this.products.add(product);
    }

    /**
     * @apiNote Выводит все категории с наименованиями продуктов в них.
     */
    public static void printCategories() {
        for (Category category : Category.categories
        ) {
            System.out.println(category);

        }
    }

    @Override
    public String toString() {
        List<String> productsNames = new ArrayList<>();
        for (Product x: products
             ) { productsNames.add(x.name);
        }
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + productsNames +
                '}';
    }
}

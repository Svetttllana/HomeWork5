import java.util.ArrayList;
import java.util.Collections;

public class HW_11_Collection {


    public static void main(String[] args) {
        Shop gucci = new Shop();
        Product belt = new Product(1, 400, "belt");
        Product hat = new Product(3, 300, "hat");
        Product skirt = new Product(2, 30000, "skirt");
        Product pants = new Product(4, 40000, "Pants");
        gucci.addProduct(belt);
        gucci.addProduct(hat);
        gucci.addProduct(skirt);
        gucci.getAllProducts();
        gucci.addProduct(pants);
        Collections.sort(gucci.shopList);

        System.out.println(gucci.shopList);

    }
}


class Product implements Comparable<Product> {

    int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int price;
    String name;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }


    int getId() {
        return id;
    }

    @Override
    public int compareTo(Product o) {
        return this.getId() - o.getId();

    }

}


class Shop {


    ArrayList<Product> shopList = new ArrayList<Product>();

    void addProduct(Product product) {

        shopList.add(product);
    }


    ArrayList<Product> getAllProducts() {

        return shopList;
    }

    void removeProduct(int id) {
        shopList.remove(id);
    }

    void editProduct(Product product) {
        shopList.set(0, product);
    }

}


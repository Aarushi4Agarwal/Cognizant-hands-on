import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(int id, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;

            System.out.println("Product updated.");
        }
        else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {

        inventory.remove(id);

        System.out.println("Product deleted.");
    }

    public void displayProducts() {

        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

}
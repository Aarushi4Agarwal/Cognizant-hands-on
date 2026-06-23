public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 5, 70000);
        Product p2 = new Product(102, "Phone", 10, 25000);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        System.out.println("Inventory:");

        inventory.displayProducts();

        inventory.updateProduct(101, 7, 72000);

        inventory.deleteProduct(102);

        System.out.println("\nAfter Operations:");

        inventory.displayProducts();
    }
}
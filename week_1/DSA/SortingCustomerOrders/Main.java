public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Aarushi", 5000),
                new Order(102, "Rahul", 1200),
                new Order(103, "Priya", 9000),
                new Order(104, "Rohan", 3000)

        };

        System.out.println("Before Sorting");

        SortOperations.display(orders);

        SortOperations.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort");

        SortOperations.display(orders);
    }
}
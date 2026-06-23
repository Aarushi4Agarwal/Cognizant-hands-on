public class Main {

    public static void main(String[] args) {

        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(new Employee(101, "Aarushi", "Developer", 80000));
        em.addEmployee(new Employee(102, "Rahul", "Tester", 60000));
        em.addEmployee(new Employee(103, "Priya", "Manager", 100000));

        System.out.println("Employees:");

        em.displayEmployees();

        System.out.println("\nSearching Employee 102");

        System.out.println(em.searchEmployee(102));

        em.deleteEmployee(102);

        System.out.println("\nAfter Deletion");

        em.displayEmployees();
    }
}
import java.util.*;

interface User { // Interface name should start with uppercase by convention
    void details();
    void displayInfo();
}

class Employee implements User {
    String name, userType;

    Employee(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("User Type: " + userType);
    }

    public void displayInfo() {
        System.out.println("Welcome, " + name);
    }
}

class Customer implements User {
    String name, userType;

    Customer(String name, String userType) {
        this.name = name;
        this.userType = userType;
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("User Type: " + userType);
    }

    public void displayInfo() {
        System.out.println("What would you like to do today, " + name + "?");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("User Type (employee/customer): ");
        String userType = sc.nextLine().toLowerCase(); // Normalize input

        User user; // Declare a reference of interface type

        if (userType.equals("employee")) {
            user = new Employee(name, userType);
        } else if (userType.equals("customer")) {
            user = new Customer(name, userType);
        } else {
            System.out.println("Invalid user type. Exiting...");
            return;
        }

        user.displayInfo(); // Polymorphic behavior

        sc.close();
    }
}

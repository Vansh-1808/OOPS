import java.util.*;

class User {
    String name, email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Buyer extends User {
    int cartItems;

    Buyer(String name, String email, int cartItems) {
        super(name, email);
        this.cartItems = cartItems;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Cart Items: " + cartItems);
    }
}

public class onlineShoopingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String email = sc.nextLine();
        int cartItems = sc.nextInt();

        Buyer customer = new Buyer(name, email, cartItems);
        
        customer.displayInfo();

        sc.close();
    }
}

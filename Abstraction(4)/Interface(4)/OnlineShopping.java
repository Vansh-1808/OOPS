import java.util.*;

interface User {
    void details();
    void shop();
}

class Seller implements User {
    String name;

    Seller(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Seller Name: " + name);
    }

    public void shop() {
        System.out.println("Welcome, " + name + ". You can add products for sale.");
    }
}

class Buyer implements User {
    String name;

    Buyer(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Buyer Name: " + name);
    }

    public void shop() {
        System.out.println("Hello " + name + ". You can browse and purchase products.");
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User Type (seller/buyer): ");
        String userType = sc.nextLine().toLowerCase();

        User user;
        if (userType.equals("seller")) {
            user = new Seller(name);
        } else if (userType.equals("buyer")) {
            user = new Buyer(name);
        } else {
            System.out.println("Invalid User Type!");
            return;
        }

        user.shop();
        sc.close();
    }
}

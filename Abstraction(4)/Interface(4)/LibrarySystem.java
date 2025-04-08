import java.util.*;

interface User {
    void details();
    void accessLibrary();
}

class Librarian implements User {
    String name, userType;

    Librarian(String name) {
        this.name = name;
        this.userType = "Librarian";
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("User Type: " + userType);
    }

    public void accessLibrary() {
        System.out.println("Welcome " + name + ". You can manage books in the library.");
    }
}

class Member implements User {
    String name, userType;

    Member(String name) {
        this.name = name;
        this.userType = "Member";
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("User Type: " + userType);
    }

    public void accessLibrary() {
        System.out.println("Hello " + name + ". You can borrow books from the library.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User Type (librarian/member): ");
        String userType = sc.nextLine().toLowerCase();

        User user;
        if (userType.equals("librarian")) {
            user = new Librarian(name);
        } else if (userType.equals("member")) {
            user = new Member(name);
        } else {
            System.out.println("Invalid User Type!");
            return;
        }

        user.accessLibrary();
        sc.close();
    }
}

import java.util.*;

interface User {
    void details();
    void performRole();
}

class Teacher implements User {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Teacher Name: " + name);
    }

    public void performRole() {
        System.out.println("Hello " + name + ". You can assign grades.");
    }
}

class Student implements User {
    String name;

    Student(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Student Name: " + name);
    }

    public void performRole() {
        System.out.println("Hello " + name + ". You can view your grades.");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User Type (teacher/student): ");
        String userType = sc.nextLine().toLowerCase();

        User user;
        if (userType.equals("teacher")) {
            user = new Teacher(name);
        } else if (userType.equals("student")) {
            user = new Student(name);
        } else {
            System.out.println("Invalid User Type!");
            return;
        }

        user.performRole();
        sc.close();
    }
}

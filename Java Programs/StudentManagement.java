import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    double grade;

    Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Display Students\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Grade: ");
                    students.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter Student ID to Remove: ");
                    int id = sc.nextInt();
                    students.removeIf(s -> s.id == id);
                    break;
                case 3:
                    students.forEach(System.out::println);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
	
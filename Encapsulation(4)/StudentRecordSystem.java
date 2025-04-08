class Student {
    private String name; // Private fields
    private int id;
    private double grade;

    // Constructor
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id + ", Grade: " + grade);
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1001, 85.5);

        student.displayInfo();              // Output: Student: Alice, ID: 1001, Grade: 85.5
        System.out.println("Name: " + student.getName()); // Output: Name: Alice
        student.setGrade(92.0);             // Update grade
        System.out.println("Updated Grade: " + student.getGrade()); // Output: Updated Grade: 92.0
        student.displayInfo();              // Output: Student: Alice, ID: 1001, Grade: 92.0
    }
}

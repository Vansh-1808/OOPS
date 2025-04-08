class Employee {
    private String name; // Private fields
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return salary * 0.1; // 10% bonus
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 5001, 60000.0);

        System.out.println("Name: " + employee.getName());         // Output: Name: John Doe
        System.out.println("Salary: $" + employee.getSalary());    // Output: Salary: $60000.0
        System.out.println("Bonus: $" + employee.calculateBonus()); // Output: Bonus: $6000.0
        employee.setSalary(65000.0);                               // Update salary
        System.out.println("New Salary: $" + employee.getSalary()); // Output: New Salary: $65000.0
    }
}

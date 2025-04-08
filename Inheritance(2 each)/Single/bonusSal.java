
class Employee {
    String name = "Rajesh";
    int salary = 1000;


    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class bonusSal extends Employee {
    int bonus = 500;


    void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
bonusSal emp = new bonusSal();
        emp.displayInfo();  
    }
}

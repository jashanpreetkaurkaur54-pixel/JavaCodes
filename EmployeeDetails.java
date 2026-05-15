abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Full-Time Employee Salary: " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part-Time Employee Salary: " + salary);
    }
}


public class EmployeeDetails {
    public static void main(String[] args) {
    FullTimeEmployee f1 = new FullTimeEmployee("Mansi", 101, 50000);
      PartTimeEmployee p1 = new PartTimeEmployee("Priya", 102, 5, 500);

        System.out.println("---- Full-Time Employee -----");
        f1.displayDetails();
        f1.calculateSalary();

        System.out.println("\n--- Part-Time Employee -----");
        p1.displayDetails();
        p1.calculateSalary();
    }
}
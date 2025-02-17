package InheritanceProgram;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, int employeeId, double monthlySalary) {

        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void displayDetails() {

        System.out.println("-----------------------");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Type: Salaried Employee");
        System.out.println("Monthly Salary: $" + getMonthlySalary());
        System.out.println("Total Pay: $" + calculatePay());

    }

    @Override
    public double calculatePay() {

        return monthlySalary;
    }

    public double getMonthlySalary() {

        return monthlySalary;
    }

}

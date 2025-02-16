package InheritanceProgram;

public class HourlyEmployee extends Employee {

    private final double hourlyRate;
    private int hoursWorked = 0;

    public HourlyEmployee(String name, int employeeId, double hourlyRate) {

        super(name, employeeId);
        this.hourlyRate = hourlyRate;
    }

    public void addHours(int hours) {

        hoursWorked += hours;
    }

    @Override
    public void displayDetails() {

        System.out.println("-----------------------");
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Type: Hourly Employee");
        System.out.println("Hourly Rate: $" + getHourlyRate());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Total Pay: $" + calculatePay());
        System.out.println("-----------------------");
    }

    @Override
    public double calculatePay() {

        return hoursWorked * hourlyRate;
    }

    public double getHourlyRate() {

        return hourlyRate;
    }

    public int getHoursWorked() {

        return hoursWorked;
    }

}

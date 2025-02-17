package InheritanceProgram;

import java.util.ArrayList;

public class PayrollSystem {

    public static void main(String[] args) {

        SalariedEmployee salEmp = new SalariedEmployee("Alice Johnson", 101, 5000.00);
        HourlyEmployee hourEmp = new HourlyEmployee("Bob Smith", 102, 20.00, 160);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(salEmp);
        employees.add(hourEmp);

        System.out.println("Employee Payroll System");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

}

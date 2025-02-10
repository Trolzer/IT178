package OOPAssignment;

public class Manager extends FullTimeEmployee{

    public Manager(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double calculateSalery() {
        return super.calculateSalery() + 10;
    }
}

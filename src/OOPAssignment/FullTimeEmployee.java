package OOPAssignment;

public class FullTimeEmployee extends BaseEmployee{

    private double baseSalery;

    public FullTimeEmployee(double baseSalary){
        super();
        this.baseSalery = baseSalary;
    }

    @Override
    public double calculateSalery() {

        return 0;
    }
}

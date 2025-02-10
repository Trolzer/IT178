package OOPAssignment;

public abstract class BaseEmployee implements Employee{

    private String name;

    @Override
    public abstract double calculateSalery();

    @Override
    public String getRole() {
        return "";
    }
}

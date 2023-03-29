package managment;


public class Director extends Manager{

    private double budget;

    public Director(String name, Integer NiNumber, double salary, String deptName, double budget) {
        super(name, NiNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus() {
        return getSalary()/100 * 2;
    }
}

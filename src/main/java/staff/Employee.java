package staff;

public abstract class Employee {

    private String name;
    private Integer NiNumber;
    private double salary;


    public Employee(String name, Integer NiNumber, double salary) {
        this.name = name;
        this.NiNumber = NiNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 0 ) {
            this.name = name;
        }
    }

    public Integer getNiNumber() {
        return NiNumber;
    }

    public void setNiNumber(Integer niNumber) {
        NiNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double raiseSalary(double increase) {
        if(increase > 0){
        return this.salary += increase;
        }else{
            return this.salary;
        }
    }
    public double payBonus() {
        return this.salary/100;
    }

}

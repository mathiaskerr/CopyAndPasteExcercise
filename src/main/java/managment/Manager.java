package managment;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;
    public Manager(String name, Integer NiNumber, double salary, String deptName) {
        super(name, NiNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

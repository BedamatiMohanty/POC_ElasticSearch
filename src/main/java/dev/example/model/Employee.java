package dev.example.model;

public class Employee {

    private int EmployeeId;
    private String Name;
    private String skillSet;

    public Employee(int employeeId, String name, String skillSet) {
        EmployeeId = employeeId;
        Name = name;
        this.skillSet = skillSet;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", Name='" + Name + '\'' +
                ", skillSet='" + skillSet + '\'' +
                '}';
    }
}

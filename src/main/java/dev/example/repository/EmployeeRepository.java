package dev.example.repository;

import dev.example.model.Employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository implements CrudRepository<Employee> {
    @Override
    public List<Employee> findAll() {
        List<Employee> empInfo = new ArrayList<>();
        Employee employee = new Employee(1,"Amy","Developer");
        Employee employee2 = new Employee(2,"Chris","Tester");
        empInfo.add(employee);
        empInfo.add(employee2);
        return empInfo;
    }
}

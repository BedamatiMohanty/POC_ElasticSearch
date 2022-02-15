package dev.example.service;

import dev.example.model.Employee;
import dev.example.repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements CrudService<Employee>{

     private final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
     private EmployeeRepository repository;

     public EmployeeService(EmployeeRepository employeeRepository){
         logger.info("Inside Service Class");
         logger.warn("Testing logger");
         repository = employeeRepository;
     }

    @Override
    public List<Employee> list() {
        return repository.findAll();
    }

    @Override
    public Employee create(Employee employee) {
        return employee;
    }

    @Override
    public Optional<Employee> get(int empId) {
        return Optional.empty();
    }

    @Override
    public void update(Employee employee, int empId) {

    }

    @Override
    public void delete(Employee employee, int empId) {

    }
}

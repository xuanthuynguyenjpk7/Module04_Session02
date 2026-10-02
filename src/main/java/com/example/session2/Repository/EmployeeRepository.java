package com.example.session2.Repository;


import com.example.session2.Model.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class EmployeeRepository {
    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> findAll(){
        return employees;
    }

    public Employee save(Employee employee) {
        employees.add(employee);
        return employee;

    }

}

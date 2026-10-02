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
// Bài 4
    public Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> findByName(String name){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
        if (employee.getFullName().contains(name)) {
            result.add(employee);
        }
        }
        return result;
    }
}

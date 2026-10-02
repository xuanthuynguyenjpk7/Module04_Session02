package com.example.session2.Service;


import com.example.session2.Model.entity.Employee;
import com.example.session2.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id);
    }

    public List<Employee> searchEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }

}

package com.example.session2.Controller;

import com.example.session2.Model.entity.Employee;
import com.example.session2.Repository.EmployeeRepository;
import com.example.session2.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);

    }

    @GetMapping("/search")
    public List<Employee> searchEmployees(@RequestParam String name){
        return employeeService.searchEmployeeByName(name);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}

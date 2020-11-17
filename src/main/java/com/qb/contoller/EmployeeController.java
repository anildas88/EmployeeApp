package com.qb.contoller;

import com.qb.domain.Employee;
import com.qb.repository.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/test")
    public String test(){
        return "hi";
    }

    /*
    Get employee data by id
     */
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        System.out.println(id);
    return employeeMapper.findById(id);
    }

    /*
    Gat all employees
     */
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeMapper.findAllEmployees();
    }

    /*
    This method use for creating new employee in db
     */
    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee){

        employeeMapper.addEmployee(employee);
        return "New employee added successfully";
    }

    /*
    **
     */
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeMapper.updateEmployee(employee);
        return employeeMapper.findById(employee.getId());
    }

    /*
    **
     */
    @DeleteMapping("/employee/{id}")
    public String removeEmployee(@PathVariable("id") int id){

        employeeMapper.deleteEmployee(id);
        return "Employee deleted on this id- "+id;
    }
}

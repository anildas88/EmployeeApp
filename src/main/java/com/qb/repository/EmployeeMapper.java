package com.qb.repository;

import com.qb.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//@Mapper
public interface EmployeeMapper {

    public Employee findById(@Param("id") int id);

    public List<Employee> findAllEmployees();

    public void addEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);

}

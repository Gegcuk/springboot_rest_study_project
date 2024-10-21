package uk.gegc.springboot_rest_study_project.dao;

import uk.gegc.springboot_rest_study_project.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);
}

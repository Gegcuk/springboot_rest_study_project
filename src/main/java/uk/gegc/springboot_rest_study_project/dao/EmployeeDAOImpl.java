package uk.gegc.springboot_rest_study_project.dao;

import uk.gegc.springboot_rest_study_project.entity.Employee;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}

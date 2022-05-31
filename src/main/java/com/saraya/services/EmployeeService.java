package com.saraya.services;

import com.saraya.dto.EmployeeDto;
import com.saraya.model.Department;
import com.saraya.model.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private static List<Employee> employees = new ArrayList<>();

    static DepartmentService service = new DepartmentService();

    private static int id = 0;

    static {
        employees.add(new Employee(generateId(), "Ibrahima", "Diop", ""
                , LocalDate.of(2020, 6, 10)
                ,1500.00, false, service.getDepartment("DEPT_1")));
        employees.add(new Employee(generateId(), "Astou", "Badiane", ""
                , LocalDate.of(2020, 6, 10)
                ,1500.00, false, service.getDepartment("DEPT_2")));
        employees.add(new Employee(generateId(), "Maimouna", "Ndiaye", ""
                , LocalDate.of(2020, 6, 10)
                ,1500.00, false, service.getDepartment("DEPT_3")));
        employees.add(new Employee(generateId(), "Souleymane", "Gueye", ""
                , LocalDate.of(2020, 6, 10)
                ,1500.00, false, service.getDepartment("DEPT_4")));

    }

    public List<Employee> getemployees(){
        return employees;
    }

    public Employee getEmployee(String id) {
        int deptPosition = employees.indexOf(new Employee(id));
        return employees.get(deptPosition);
    }

    public void createEmployee(EmployeeDto dto) {
        // Creer un formatter pour convertir le String en LocalDate
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
        Employee emp = new Employee(generateId());
        emp.setFirstName(dto.getFirstName());
        emp.setLastName(dto.getLastName());
        emp.setHireDate(LocalDate.now());
        emp.setSalary(dto.getSalary());
        emp.setDepartment(service.getDepartment(dto.getDeptId()));

        /*if (emp.getManager()){
            service.getDepartment(dto.getDeptId()).setManager(emp);
        }*/
        employees.add(emp);
    }

    public static String generateId(){
        return "EMPNO_" + ++id;
    }

    public void updateEmployee(String id, String firstName, String lastName,
                               String picture, LocalDate hireDate,
                               Double salary, Boolean manager, Department department) {
        Employee employee = getEmployee(id);
        employee.setDepartment(department);
        employees.set(employees.indexOf(new Employee(id)), employee);
    }

    public void deleteEmployee(String id) {
        employees.remove(new Employee(id));
    }
}

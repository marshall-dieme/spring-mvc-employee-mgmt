package com.saraya.services;

import com.saraya.model.Department;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentService {
    private static List<Department> departments = new ArrayList<>();
    private static int id = 0;

    static {
        departments.add(new Department(generateId(), "IT", null));
        departments.add(new Department(generateId(), "HR", null));
        departments.add(new Department(generateId(), "Finance", null));
        departments.add(new Department(generateId(), "Networking", null));
    }

    public List<Department> getDepartments(){
        return departments;
    }

    public Department getDepartment(String id) {
        int deptPosition = departments.indexOf(new Department(id));
        return departments.get(deptPosition);
    }

    public Department createDepartment(String name) {
        Department d = new Department(generateId(), name, null);
        departments.add(d);
        return d;
    }

    public static String generateId(){
        return "DEPT_" + ++id;
    }

    public void updateDepartment(String id, String deptName) {
        Department d = getDepartment(id);
        d.setName(deptName);
        int index = departments.indexOf(new Department(id));
        departments.set(index, d);
    }

    public void deleteDepartment(String id) {
        departments.remove(new Department(id));
    }
}

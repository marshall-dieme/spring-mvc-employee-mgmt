package com.saraya.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeDto {

    String matricule;
// here I can say that a first name will have at least 3 characters
    //I use the @Size annotation to do it
    @Size(min = 3, message = "Enter at least 3 characters")
    String firstName;

    String lastName;
    String hireDate;
    double salary;
    String manager;
    String deptId;

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName, String hireDate, double salary, String manager, double prime, String deptId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.salary = salary;
        this.manager = manager;
        this.deptId = deptId;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }



    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "matricule='" + matricule + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                ", manager='" + manager + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}

package com.saraya.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String matricule; //EMPNO_{ 1, 2 , 3 ...}
    private String firstName;
    private String lastName;

    private String picture;

    private LocalDate hireDate;
    private Double salary;
    private Boolean manager;

    private double prime;
    private Department department;

    public Employee() {
    }

    public Employee(String matricule) {
        this.matricule = matricule;
    }

    public Employee(String matricule, String firstName, String lastName, String picture, LocalDate hireDate, Double salary, Boolean manager, Department department) {
        this.matricule = matricule;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.hireDate = hireDate;
        this.salary = salary;
        this.manager = manager;
        this.prime = 0;
        this.department = department;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getManager() {
        return manager;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getMatricule(), employee.getMatricule());
    }

    @Override
    public String toString() {
        return  firstName + ' ' + lastName ;
    }
}

package com.saraya.model;

import java.util.Objects;

public class Department {
    private String id;
    private String name;
    private Employee manager;



    public Department() {
    }

    public Department(String id) {
        this.id = id;
    }

    public Department(String id, String name, Employee manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public String toString() {
        return getName();
    }
}

package com.coherent.training.selenium.stanila.employee;

public class Employee {
    private String name;
    private String position;
    private String office;

    public Employee(String name, String position, String office) {
        this.name = name;
        this.position = position;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", office='" + office + '\'' +
                '}'+"\n";
    }
}


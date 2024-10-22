package com.github.ffrancoc.sge.enums;

public enum EmployeeGender {
    MALE("m"),
    FEMALE("f"),
    OTHER("o");

    private String employeeGender;

    EmployeeGender(String gender) {
        this.employeeGender = gender;
    }

    public String getEmployeeGender() {
        return this.employeeGender;
    }

    public void setEmployeeGender(String gender) {
        this.employeeGender = gender;
    }
}

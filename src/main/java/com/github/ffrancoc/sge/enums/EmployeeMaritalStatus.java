package com.github.ffrancoc.sge.enums;

public enum EmployeeMaritalStatus {
    SINGLE("s"),
    MARRIED("m"),
    WIDOWED("w"),
    DIVORCED("d"),
    SEPARATED("sp");

    private String employeeMaritalStatus;

    EmployeeMaritalStatus(String status) {
        this.employeeMaritalStatus = status;
    }

    public String getEmployeeMaritalStatus() {
        return this.employeeMaritalStatus;
    }

    public void setEmployeeMaritalStatus(String status) {
        this.employeeMaritalStatus = status;
    }
}

package com.example.company.data;

import java.sql.Date;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int departmentId;
    private String departmentName;

    public Employee(String firstName, String lastName, Date dateOfBirth, int departmentId, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee() {

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    /*public java.sql.Date getSqlDate() {
        java.sql.Date sqlDate = new java.sql.Date(getDateOfBirth().getTime());
        return sqlDate;
    }*/
}

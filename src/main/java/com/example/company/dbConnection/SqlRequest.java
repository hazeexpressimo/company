package com.example.company.dbConnection;

public class SqlRequest {
    public static final String FIND_ALL_EMPLOYEE = "select firstname, lastname, birthdate, \"departmentId\" from employee";
    public static String ADD_EMPLOYEE = "insert into employee (firstname, lastname, birthdate, \"departmentId\") values (?, ?, ?, ?)";

    public static final String FIND_ALL_DEPARTMENTS = "select id, name, \"startTime\", \"endTime\", floor from department";
    public static String ADD_DEPARTMENT = "insert into department (name, \"startTime\", \"endTime\", floor) values (?, ?, ?, ?)";

}

package com.example.company.dao;

import com.example.company.data.Department;
import com.example.company.dbConnection.ConnectionManager;
import com.example.company.dbConnection.SqlRequest;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {

    public Date convertDate(java.util.Date date) throws ParseException {
        java.util.Date formattedDate = new SimpleDateFormat("HH:mm").parse(String.valueOf(date));
        return new Date(formattedDate.getTime());
    }

    public List<Department> findAll() {
        Connection connection = ConnectionManager.getInstance().getConnection();
        List<Department> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SqlRequest.FIND_ALL_DEPARTMENTS);
            while (rs.next()) {
                String name = rs.getString("name");
                Timestamp startTime = rs.getTimestamp("startTime");
                Timestamp endTime = rs.getTimestamp("endTime");
                DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
                LocalDateTime startTimeLocal = LocalDateTime.parse(startTime.toLocalDateTime().format(dtf));
                LocalDateTime endTimeLocal = LocalDateTime.parse(endTime.toLocalDateTime().format(dtf));
                int floor = rs.getInt("floor");
                Department department = new Department(name, startTimeLocal, endTimeLocal, floor);
                result.add(department);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    public void addDepartment(Department department) throws SQLException, ParseException {
        Connection connection = ConnectionManager.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SqlRequest.ADD_DEPARTMENT);
        preparedStatement.setString(1, department.getName());
        preparedStatement.setTimestamp(2, Timestamp.valueOf(department.getStartTime()));
        preparedStatement.setTimestamp(3, Timestamp.valueOf(department.getEndTime()));
        preparedStatement.setInt(4, department.getFloor());
        preparedStatement.executeUpdate();
    }
}

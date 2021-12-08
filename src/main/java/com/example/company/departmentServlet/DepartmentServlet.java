package com.example.company.departmentServlet;
import com.example.company.dao.DepartmentDAO;
import com.example.company.data.Department;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "departmentServlet", value = {"/addDepartment", "/showDepartment"})
public class DepartmentServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getRequestURI().contains("showDepartment")) {
            List<Department> departments = new DepartmentDAO().findAll();
            showDepartment(departments, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        if (request.getRequestURI().contains("addDepartment")) {
            try {
                addDepartment(request, response);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    private void addDepartment(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        int id = 0;
        String name = request.getParameter("nameDepReq");
        String startTime = request.getParameter("startTimeReq");
        String endTime = request.getParameter("endTimeReq");
        LocalTime startTimeReq = LocalTime.parse(startTime);
        LocalTime endTimeReq = LocalTime.parse(endTime);
        int floor = Integer.parseInt(request.getParameter("floorDepReq"));
        try {
            Department department = new Department(id, name, startTimeReq, endTimeReq, floor);
            DepartmentDAO departmentDAO = new DepartmentDAO();
            departmentDAO.addDepartment(department);
            response.sendRedirect(request.getContextPath() + "/mainPage.jsp");
        } catch (SQLException | IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void showDepartment(List<Department> departments, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.writeValue(writer, departments);
    }

    public void destroy() {
    }
}
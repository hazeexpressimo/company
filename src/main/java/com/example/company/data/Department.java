package com.example.company.data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Department {
    private int id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int floor;

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Department(String name, LocalDateTime startTime, LocalDateTime endTime, int floor) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.floor = floor;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

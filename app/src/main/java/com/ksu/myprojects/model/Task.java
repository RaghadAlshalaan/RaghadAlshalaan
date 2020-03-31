package com.ksu.myprojects.model;


import java.util.Date;



public class Task {


    private int id;


    private int projectId;

    private String name;

    private String assignTo;

    //todo convert to array
    private String resources;

    private int cost;


    private Date startDate;


    private Date endDate;

    public Task(String name) {
        this.name = name;
    }

    public Task() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(String assignTo) {
        this.assignTo = assignTo;
    }
    public String getResources() {
        return resources;
    }

    public void setResources(String assignTo) {
        this.resources = resources;
    }

}

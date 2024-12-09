package main.PersonalPlanner.App;

import java.time.*;

public class Task {

    /* 
     * Task class that the planner calls to create each task in the Planner list
     * 
     */

    private String id;
    private String description;
    private LocalDate date;
    private String status;
    private String project;

    /*
     * Constructor class for Task, for an explicitly called task
     */

    public Task(String id, String description, LocalDate date, String project) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.status = "In Progress";
        this.project = project;
    }

    /*
     * Setter and getter methods for task creation/editing
     */

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


    
    @Override
    public String toString() {
        return id + ": " + description + " | " + date + " | " + status + " | " + "(" + project + ")";
    }
}

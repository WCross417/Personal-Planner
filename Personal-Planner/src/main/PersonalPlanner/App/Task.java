package main.PersonalPlanner.App;

import java.time.*;

public class Task {

    /* 
     * Task class that the planner calls to create each task in the Planner list
     * 
     */

    private String id;
    private String description;
    private String date;
    private String status;
    private String project;

    /*
     * Constructor class for Task, for a called task
     */

    public Task() {
        this.id = "-1";
        this.description = "description";
        this.date = "0000-00-00";
        this.status = "In Progress";
        this.project = "default";
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatusDone() {
        this.status = "Done";
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public static Task buildTask(String id, String description, String date, String project) {
        Task task = new Task();

        task.setId(id);
        task.setDescription(description);
        task.setDate(date);
        task.setProject(project);

        return task;
    }


    
    @Override
    public String toString() {
        return id + ": " + description + " | " + date + "(yyyy-MM-dd) | " + status + " | " + "(" + project + ")";
    }
}

package App;

public class Task {
    private int id;
    private String description;
    private boolean isCompleted; 
    private String status;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
        this.status = "In Progress";
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
        status = "Done";
    }

    public String toString() {
        return "Task " + id + ": " + description + "  | " + status + " |";
    }
}

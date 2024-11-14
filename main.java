import java.util.ArrayList;
import java.util.Scanner;


public class Planner {
    private ArrayList<Task> tasks;
    private int nextId;

    public Planner() {
        tasks = new ArrayList<>();
        nextId = 1; // Initial ID value
    }

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
    
    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("Task deleted successfully.");
    }
}
public static void main(String[] args) {
    Planner planner = new Planner();
    Scanner scnr = new Scanner(System.in);
    boolean running = true; 

    while (running) {
        System.out.println("\nMenu:");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        int choice = scnr.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter task description: ");
                String description = scnr.nextLine();
                planner.addTask(description);
                break;
            case 2:
                planner.viewTasks();
                break;
            case 3:
                System.out.print("Enter task ID to mark as completed: ");
                int idToComplete = scnr.nextInt();
                planner.markTaskAsCompleted(idToComplete);
                break;
            case 4:
                System.out.print("Enter task ID to delete: ");
                int idToDelete = scnr.nextInt();
                planner.deleteTask(idToDelete);
                break;
            case 5:
                running = false;
                break;
            default:
            System.out.println("Invalid option. Try again.");
        }
        scnr.close();
    }

}

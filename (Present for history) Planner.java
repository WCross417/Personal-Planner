package main.PersonalPlanner.App;

import main.PersonalPlanner.Features.*;

import java.util.*;
/* 
 *
 * This is the main object that runs the program, creating and holding tasks,
 * Able to be saved and read to and from a text file. 
 * Aim to be able to sort tasks by date, project title, and insertion order. 
 * 
 */

public class Planner {


    public static Map<String, Task> tasks = new LinkedHashMap<>();
    public static boolean running = true;

    
    public void start() {
        System.out.println("---- Personal Planner Application ----");
        System.out.println("--------------------------------------");
        while (Planner.running) {
            showMenu();
            int action = readAction();
            execute(action);
        }

    }

    public void showMenu() {
        System.out.println("\n1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Edit Task");
        System.out.println("5. Mark Task Done");
        System.out.println("6. Save Planner");
        System.out.println("7. Read Planner File");
        System.out.println("8. Sort by Project Name");
        System.out.println("9. Sort by Due Date");
        System.out.println("10. Exit\n");
    }

    public int readAction() {
        List <Integer> available = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        while (true) {
            try {
                System.out.println("Choose option:");
                Scanner scnr = new Scanner(System.in);
                int choice = scnr.nextInt();
                if (available.contains(choice)) {
                    return choice;
                }
                else {
                    System.out.println("Enter proper choice: ");
                }
            }
            catch (Exception e) {
                System.out.println("Enter an Int Value: ");
            }
        }
    }

    public void execute(int actionNum) {
        Actions user;
        switch (actionNum) {
            case Actions.ADD_TASK:
            break;
            case Actions.VIEW_TASKS:
            break;
            case Actions.DELETE_TASK:
            break;
            case Actions.EDIT_TASK:
            break;
            case Actions.MARK_AS_DONE:
            break;
            case Actions.SAVE_TO_FILE:
            break;
            case Actions.READ_FROM_FILE:
            break;
            case Actions.SORT_BY_PROJECT:
            break;
            case Actions.SORT_BY_DATE:
            break;

            
        }
    }



    

    /*public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } 
        else {
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

    public void setTimerForTask(int id, long delayInSeconds) {
        for (Task task : tasks) {
        if (task.getId() == id) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                System.out.println("Reminder: Task \"" + task.getDescription() + "\" is due!");
                    }
            }, delayInSeconds * 1000); // Convert seconds to milliseconds
            System.out.println("Timer set for task: " + task.getDescription());
                    return;
            }
        }
        System.out.println("Task not found.");
    }

/*public static void main(String[] args) {
    Planner planner = new Planner();
    Scanner scnr = new Scanner(System.in);
    boolean running = true; 

    while (running) {
        
      
        int choice = scnr.nextInt();
        scnr.nextLine();

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
        
    }
    scnr.close(); */
}


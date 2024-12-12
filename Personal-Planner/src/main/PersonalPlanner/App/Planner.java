package main.PersonalPlanner.App;

import java.util.*;

import main.PersonalPlanner.Features.*;

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
        System.out.println("|------------------------------------|");
        System.out.println("|    Personal Planner Application    |");
        System.out.println("|------------------------------------|");
        while (Planner.running) {
            showMenu();
            int action = read();
            execute(action);
        }

    }

    public void showMenu() {
        System.out.println("\n\n|------------------------------------|");
        System.out.println("|         1. Add Task                |");
        System.out.println("|         2. View Tasks              |");
        System.out.println("|         3. Delete Task             |");
        System.out.println("|         4. Edit Task               |");
        System.out.println("|         5. Mark Task Done          |");
        System.out.println("|         6. Save Planner            |");
        System.out.println("|         7. Read Planner File       |");
        System.out.println("|         8. Sort by Project Name    |");
        System.out.println("|         9. Sort by Due Date        |");
        System.out.println("|         10. Exit                   |");
        System.out.println("|------------------------------------|\n\n");
    }

    public int read() {
        List <Integer> available = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        while (true) {
            try {
                System.out.print("Choose option:");
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
        Actions action;
        switch (actionNum) {

            case Actions.ADD_TASK:
                action = new AddTask();
                action.showInfo();
                String input = action.readIn();
                if (!input.equals("0")) {
                    action.executeAction(input);
                }
                break;

            case Actions.VIEW_TASKS:
                if (tasks.size() > 0) {
                    action = new ViewTasks();
                    System.out.println("\n\n");
                    action.executeAction(null);
                }
                else {
                    System.out.println("Tasks Empty; Add Tasks.");
                }
                break;

            case Actions.DELETE_TASK:
                if (tasks.size() > 0) {
                    action = new DeleteTask();
                    action.showInfo();
                    String id = action.readIn();
                    if (!id.equals("0")) {
                        action.executeAction(id);
                    }
                }
                else {
                    System.out.println("Tasks Empty; Add Tasks.");
                }
                break;

            case Actions.EDIT_TASK:
                if (tasks.size() > 0) {
                    action = new EditTask();
                    action.showInfo();
                    String info = action.readIn();
                    if (!info.equals("0")) {
                        action.executeAction(info);
                    }
                }
                else {
                    System.out.println("Tasks Empty; Add Tasks.");
                }
                break;

            case Actions.MARK_AS_DONE:
                if (tasks.size() > 0) {
                    action = new MarkAsDone();
                    action.showInfo();
                    String id = action.readIn();
                    if (!id.equals("0")) {
                        action.executeAction(id);
                    }

                }
                else {
                    System.out.println("Tasks Empty; Add Tasks.");
                }
                break;

            case Actions.SAVE_TO_FILE:
                if (tasks.size() > 0) {
                    action = new SaveToFile();
                    action.showInfo();
                    String file = action.readIn();
                    if (!file.equals("0")) {
                        action.executeAction(file);
                    }
                }
                else {
                    System.out.println("Tasks Empty; Add Tasks.");
                }
                break;

            case Actions.READ_FROM_FILE:
                action = new ReadFromFile();
                action.showInfo();
                String file = action.readIn();
                if (!file.equals("0")) {
                    action.executeAction(file);
                }
                break; 

            case Actions.SORT_BY_PROJECT:
                action = new SortByProject();
                action.executeAction(null);
                break; 

            case Actions.SORT_BY_DATE:
                action = new SortByDate();
                action.executeAction(null);
                break;

            case Actions.EXIT:
                running = false;
                System.out.println("\n\nGoodbye!\n\n");
                break;
        }
    }
}

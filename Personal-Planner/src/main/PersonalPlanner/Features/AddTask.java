package main.PersonalPlanner.Features;

import java.util.Scanner;
import main.PersonalPlanner.App.*;

public class AddTask extends Actions {

    @Override
    public void showInfo() {
        System.out.println("\nTo add a new task, follow below format:");
        System.out.println("ID, Task, Due Date (yyyy-MM-dd), Project Name");
        System.out.println("\nEnter 0 to Return to Menu");
    }

    @Override
    public String readIn() {
        while (true) {
            System.out.println("\nEnter Task: ");
            Scanner scnr = new Scanner(System.in);
            String input = scnr.nextLine();

            if (!input.equals("0")) {
                String[] section = input.split(", ");
                if (section.length == 4) {
                    if (Planner.tasks.get(section[0]) == null) {
                        return input;
                    }
                    else {
                        System.out.println("Task ID pre-existing, re-enter: ");
                    }
                }
                else {
                    System.out.println("Format wrong, re-enter: ");
                }
            }
            else {
                return input;
            }
        }
    }

    @Override
    public void executeAction(String in) {
        String[] section = in.split(",");
        Task task = Task.buildTask(section[0], section[1], section[2], section[3]);

        Planner.tasks.put(task.getId(), task);
        System.out.println("\n\nTask added succesfully!\n\n");
    }

}

package main.PersonalPlanner.Features;

import java.util.Scanner;

import main.PersonalPlanner.App.Planner;

public class EditTask extends Actions {

    @Override
    public void showInfo() {
        System.out.println("\nTo edit a task, follow formatting");
        System.out.println("ID, Task, Due Date (yyyy-MM-dd), Project Name");
        System.out.println("Where the ID is the task to be edited");
        System.out.println("Mark '0' where no edit is needed");
        System.out.println("\nEnter 0 to Return to Menu");
    }

    @Override
    public String readIn() {
        while (true) {
            System.out.println("\nEnter task + edits: ");
            Scanner scnr = new Scanner(System.in); 
            String input = scnr.nextLine();

            if (!input.equals("0")) {
                String[] edit = input.split(", ");
                if (edit.length == 4) {
                    if (Planner.tasks.get(edit[0]) != null) {
                        return input;
                    } else {
                        System.out.println("ID not found, enter existing ID: ");
                    }
                }
                else { 
                    System.out.println("Enter correct format:"); 
                }
            }
            else { 
                return input; 
            }
        }           
    }

    @Override
    public void executeAction(String in) {
        String[] edit = in.split(", ");

        boolean change = false;

        if (!edit[1].equals("0")) {
            Planner.tasks.get(edit[0]).setDescription(edit[1]);
            change = true;
        }

        if (!edit[2].equals("0")) {
            Planner.tasks.get(edit[0]).setDate(edit[2]);
            change = true;
        }

        if (!edit[3].equals("0")) {
            Planner.tasks.get(edit[0]).setProject(edit[3]);
            change = true;
        }

        if (change) {
            System.out.print("Task edited succesfully");
        }
        else {
            System.out.println("No change made");
        } 
    }  
}

package main.PersonalPlanner.Features;

import java.util.Scanner;

import main.PersonalPlanner.App.Planner;

public class MarkAsDone extends Actions {

    @Override
    public void showInfo() {
        System.out.println("\nTo mark a task done, enter ID");
        System.out.println("\nEnter 0 to Return to Menu");
    }

    @Override
    public String readIn() {
       while (true) {
            System.out.println("\nEnter ID: ");
            Scanner scnr = new Scanner(System.in);
            try { 
                String id = scnr.nextLine();
                if (!id.equals("0")) {
                    if (Planner.tasks.containsKey(id)) {
                        return id;
                    }
                    else {
                        System.out.println("ID not found, enter existing ID");
                    }
                }
                else {
                    return id;
                }
                
            }
            catch (Exception e) {
                System.out.println("Enter a valid ID or 0 to return to menu");
            }

        }
    }

    @Override
    public void executeAction(String in) {
        Planner.tasks.get(in).setStatusDone();
        System.out.println("Task makred done succesfully!");
    }
    
}

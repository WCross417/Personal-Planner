package main.PersonalPlanner.Features;

import main.PersonalPlanner.App.*;
import java.io.*;
import java.util.*;

public class ReadFromFile extends Actions{

    @Override
    public void showInfo() {
        System.out.println("\nEnter file path to read from");
        System.out.println("\nEnter 0 to Return to Menu");
    }

    @Override
    public String readIn() {
        while (true) {
            System.out.println("\nFile path: ");
            Scanner scnr = new Scanner(System.in);
            String input = scnr.nextLine();
            return input;
        }
    }

    @Override
    public void executeAction(String in) {
        try (BufferedReader reader = new BufferedReader(new FileReader(in))) {
            Planner.tasks.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] sections = line.split(", ", 5);
                if (sections.length == 5) {
                    Task task = Task.buildTask(sections[0], sections[1], sections[2], sections[4]);
                    if ("Done".equals(sections[3])) {
                        task.setStatusDone();
                    }
                    Planner.tasks.put(task.getId(), task);
                }
            }
            System.out.println("Planner read from " + in + " succesfully");     
        }
        catch (IOException e) {
            System.out.println("Unable to read from file " + in + ". " + e.getMessage());
        }
    }
    
}

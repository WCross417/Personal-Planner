package main.PersonalPlanner.Features;

import main.PersonalPlanner.App.*;
import java.io.*;
import java.util.*;


public class SaveToFile extends Actions{

    @Override
    public void showInfo() {
        System.out.println("\nEnter file path to save to");
        System.out.println("file should be named (data/EXAMPLE.txt)");
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
        File file = new File(in);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs(); 
            }
        
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            }
        
            try (PrintWriter scribe = new PrintWriter(new FileOutputStream(file))) {
                for (Task task : Planner.tasks.values()) {
                    scribe.println(String.format("%s, %s, %s, %s, %s",
                        task.getId(), 
                        task.getDescription(), 
                        task.getDate(), 
                        task.getStatus(), 
                        task.getProject()));
                }
                System.out.println("Planner saved to " + file.getAbsolutePath() + " succesfully");
            }
        }
        catch (IOException e) {
            System.out.println("Unable to save to file " + in + ". " + e.getMessage());
        }
    }
    
}

package main.PersonalPlanner.Features;

import main.PersonalPlanner.App.*;

public class ViewTasks extends Actions{

    @Override
    public void showInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }

    @Override
    public String readIn() {
        throw new UnsupportedOperationException("Unimplemented method 'readIn'");
    }

    @Override
    public void executeAction(String in) {
        System.out.println("| Task | Date (yyyy-MM-dd) | Status | (project name) | ID             |");
        System.out.println("|---------------------------------------------------------------------|");
        Planner.tasks.forEach((key, task) -> System.out.println("| " + task.getDescription() 
        + " |" + task.getDate() + " | " + task.getStatus() + " | " 
        + "(" + task.getProject() + " )" + " | ID: (" + key + ") ")); 
        System.out.println("|---------------------------------------------------------------------|");
    }
    
}

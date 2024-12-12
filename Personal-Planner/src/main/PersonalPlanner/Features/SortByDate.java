package main.PersonalPlanner.Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import main.PersonalPlanner.App.Planner;
import main.PersonalPlanner.App.Task;

public class SortByDate extends Actions{

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }

    @Override
    public String readIn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readIn'");
    }

    @Override
    public void executeAction(String in) {
        List<Map.Entry<String, Task>> list = new ArrayList<>(Planner.tasks.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Task>>() {
            public int compare(Map.Entry<String, Task> firstTask, Map.Entry<String, Task> secondTask) {
                String firsString = firstTask.getValue().getDate();
                String secondString = secondTask.getValue().getDate();

                int end = firsString.compareTo(secondString);
                return end;
            }   
        }   );
        Planner.tasks.clear();
        list.forEach(entry -> Planner.tasks.put(entry.getKey(), entry.getValue()));

        System.out.println("\nTasks sorted by Project");
    }
    
}

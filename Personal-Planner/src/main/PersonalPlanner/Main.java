package main.PersonalPlanner;

import main.PersonalPlanner.App.*;

public class Main {

    /* 
     *   This program will create a Planner object and run it 
     *   The planner will create multiple tasks 
     *   The planner will be able to be saved and recalled later. 
     *   A task will be able to track what project it belongs to, its title, id, and progress
     *   Would like to try to get a due date in there as well
     */

    public static void main(String[] args) {


        Planner planner = new Planner();

        planner.start();
    }

}
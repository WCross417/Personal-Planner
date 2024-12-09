package main.PersonalPlanner.Features;

public abstract class Actions {
    
    /*
     * Actions is a class that holds all of the basic tools needed for each action performed 
     * by the user! It holds the final variables to determine what action is being called. 
     * This helps with keeping track of any specific action, and what class to call based on 
     * said information. 
     */

    public static final int ADD_TASK = 1;
    public static final int VIEW_TASKS = 2;
    public static final int DELETE_TASK = 3;
    public static final int EDIT_TASK = 4;
    public static final int MARK_AS_DONE = 5;
    public static final int SAVE_TO_FILE = 6;
    public static final int READ_FROM_FILE = 7;
    public static final int SORT_BY_PROJECT = 8;
    public static final int SORT_BY_DATE = 9;
    public static final int EXIT = 10;

    /* 
     * Each action is different, and requires different instructions. 
     * Only one method is necessary, as they are all print functions. 
     */

    public abstract void showInfo();

    /* 
     * Similarly, each action needs different input. However, they all still
     * require input, so a shared method name simplifies as well. 
     */

    public abstract String readIn();

    /*
     * Lastly, as each class needs to actually implement its action, 
     * a shared method for doing so makes things easier. 
     */

    public abstract void executeAction(String in);


}

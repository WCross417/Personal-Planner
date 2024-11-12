import java.util.Scanner;

public class Task {
    private int priorityNum;
    private String taskData; 

    public Task(int priorityNum, String taskData) {
        this.priorityNum = priorityNum;
        this.taskData = taskData;
    }

    public int getPriority() {
        return priorityNum;
    }
}

public static void newTask(Scanner scnr) {
    System.out.println("Task Priority:");
    int priority = scnr.nextInt();
    System.out.println("Task details:");
    String detail = scnr.nextLine();

    Task task = new Task(priority, detail);
}

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    

public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    

public class ToDoList {
    public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
    ArrayList<Task> taskList = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTo-Do List Menu: ");
            System.out.println("1. Add a Task ");
            System.out.println("2. View All Tasks ");
            System.out.println("3. Exit ");

            int choices = scnr.nextInt();
            scnr.nextLine();
        }
    }
}




}






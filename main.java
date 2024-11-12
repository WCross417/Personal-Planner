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
    






}






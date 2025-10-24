package CO4_ASSIGNMENT;

/**
1. Construct a task scheduling system utilizing a LinkedList<String> as a task queue,
   develop a processTasks() method to remove and process the initial task (display it),
   trigger a NoSuchElementException (unchecked) if the list is empty,
   handle it with a try-catch block displaying "No tasks left",
   and use finally to print "Processing complete" after each attempt,
   testing with three tasks: add them, process all, and attempt one more to provoke the exception.
*/

import java.util.*;

public class Q1 {
    LinkedList<String> tasks = new LinkedList<>();

    void addTask(String task) {
        tasks.add(task);
    }

    void processTasks() {
        try {
            String task = tasks.removeFirst();
            System.out.println("Processing task: " + task);
        } catch (NoSuchElementException e) {
            System.out.println("No tasks left");
        } finally {
            System.out.println("Processing complete\n");
        }
    }

    public static void main(String[] args) {
        Q1 scheduler = new Q1();
        scheduler.addTask("Task 1");
        scheduler.addTask("Task 2");
        scheduler.addTask("Task 3");

        scheduler.processTasks();
        scheduler.processTasks();
        scheduler.processTasks();
        scheduler.processTasks(); // triggers exception
    }
}

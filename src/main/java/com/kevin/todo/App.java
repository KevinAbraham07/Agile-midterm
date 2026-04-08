package com.kevin.todo;

import java.util.HashMap;
import java.util.Map;

public class App {

    private static final Map<Integer, String> tasks = new HashMap<>();

    public static String addTask(int id, String task) {
        if (tasks.containsKey(id)) {
            return "Task already exists";
        }
        tasks.put(id, task);
        return "Task added";
    }

    public static String updateTask(int id, String newTask) {
        if (!tasks.containsKey(id)) {
            return "Task not found";
        }
        tasks.put(id, newTask);
        return "Task updated";
    }

    public static String deleteTask(int id) {
        if (!tasks.containsKey(id)) {
            return "Task not found";
        }
        tasks.remove(id);
        return "Task deleted";
    }

    public static void main(String[] args) {
        System.out.println("To Do List Service Running...");

        System.out.println(addTask(1, "Complete Jenkins Pipeline"));
        System.out.println(updateTask(1, "Complete Docker Integration"));
        System.out.println(deleteTask(1));

        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
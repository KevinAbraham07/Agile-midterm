package com.kevin.todo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddTask() {
        assertEquals("Task added", App.addTask(1, "Learn Docker"));
    }

    @Test
    void testDuplicateTask() {
        App.addTask(2, "Task");
        assertEquals("Task already exists", App.addTask(2, "Duplicate"));
    }

    @Test
    void testUpdateTask() {
        App.addTask(3, "Old Task");
        assertEquals("Task updated", App.updateTask(3, "New Task"));
    }

    @Test
    void testDeleteTask() {
        App.addTask(4, "Delete Me");
        assertEquals("Task deleted", App.deleteTask(4));
    }

    @Test
    void testDeleteMissingTask() {
        assertEquals("Task not found", App.deleteTask(999));
    }
}
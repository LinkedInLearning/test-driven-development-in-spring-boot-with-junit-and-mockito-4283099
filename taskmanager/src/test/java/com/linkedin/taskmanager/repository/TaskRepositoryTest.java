package com.linkedin.taskmanager.repository;

import com.linkedin.taskmanager.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

    @Test
    void testSaveTask() {
        // arrange
        Task task = new Task("Test task", "To do");

        // act
        Task savedTask = taskRepository.save(task);

        // assert
        assertNotNull(savedTask);
        assertEquals("Test task", savedTask.getTitle());
    }

    @Test
    void testDeleteTask() {
        // arrange
        Task task = new Task("Task to delete", "Done");
        taskRepository.save(task);

        // act
        taskRepository.delete(task);
        Optional<Task> deletedTask = taskRepository.findById(task.getId());

        // assert
        assertFalse(deletedTask.isPresent());

    }
}

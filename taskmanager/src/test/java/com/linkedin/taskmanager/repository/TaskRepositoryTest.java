package com.linkedin.taskmanager.repository;

import com.linkedin.taskmanager.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TaskRepositoryTest {
    @Autowired
    private TaskRepository taskRepository;
    @Test
    void testSaveTask() {
        // arrange
        Task task = new Task();
        task.setTitle("Test Task");
        task.setDescription("This is test task");

        // act
        Task savedTask = taskRepository.save(task);

        // assert
        assertNotNull(savedTask.getId());
        assertEquals("Test Task", savedTask.getTitle());
    }
}

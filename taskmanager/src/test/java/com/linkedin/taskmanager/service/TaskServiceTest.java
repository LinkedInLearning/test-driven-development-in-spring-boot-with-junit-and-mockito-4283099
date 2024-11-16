package com.linkedin.taskmanager.service;

import com.linkedin.taskmanager.model.Task;
import com.linkedin.taskmanager.repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {
    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    void testUpdateTaskStatus() {
        // arrange
        Task task = new Task(1L, "Existing task", "To do");

        when(taskRepository.findById(1L)).thenReturn(Optional.of(task));
        when(taskRepository.save(any(Task.class))).thenReturn(task);

        // act
        Task updatedTask = taskService.updateTaskStatus(1L, "In progress");

        // assert
        assertNotNull(updatedTask);
        assertEquals("In progress", updatedTask.getStatus());
        verify(taskRepository, times(1)).findById(1L);
        verify(taskRepository, times(1)).save(task);
    }

}

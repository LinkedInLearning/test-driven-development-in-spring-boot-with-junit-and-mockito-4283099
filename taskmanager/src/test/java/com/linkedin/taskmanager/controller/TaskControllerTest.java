package com.linkedin.taskmanager.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.taskmanager.model.Task;
import com.linkedin.taskmanager.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

@WebMvcTest(TaskController.class)
public class TaskControllerTest {
    @MockBean
    private TaskService taskService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testGetAllTasks() {
        // arrange
        List<Task> tasks = Arrays.asList(
                new Task("Task 1", "To do"),
                new Task("Task 2", "In progress")
        );

//        when(taskService.getA)
        // act & assert

    }
}

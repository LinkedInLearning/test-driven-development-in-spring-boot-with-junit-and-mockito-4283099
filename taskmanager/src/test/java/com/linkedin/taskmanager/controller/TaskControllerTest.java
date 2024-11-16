package com.linkedin.taskmanager.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.taskmanager.model.Task;
import com.linkedin.taskmanager.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;


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
    void testGetAllTasks() throws Exception {
        // arrange
        List<Task> tasks = Arrays.asList(
                new Task("Task 1", "To do"),
                new Task("Task 2", "In progress")
        );

        when(taskService.getAllTasks()).thenReturn(tasks);

        // act & assert
        mockMvc.perform(get("/tasks").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].title").value("Task 1"))
                .andExpect(jsonPath("$[1].title").value("Task 2"));
    }
}

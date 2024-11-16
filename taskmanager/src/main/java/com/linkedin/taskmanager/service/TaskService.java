package com.linkedin.taskmanager.service;

import com.linkedin.taskmanager.exception.TaskNotFoundException;
import com.linkedin.taskmanager.model.Task;
import com.linkedin.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTaskStatus(Long id, String status){
        Task taskToUpdate = getTaskById(id);
        taskToUpdate.setStatus(status);
        return taskRepository.save(taskToUpdate);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found, id: " + id));
    }

    public Task updateTask(Long id, Task taskData) {
        Task existingTask = getTaskById(id);
        existingTask.setTitle(taskData.getTitle());
        existingTask.setStatus(taskData.getStatus());
        return taskRepository.save(existingTask);
    }

    public void deleteTask(Long id) {
        Task taskToDelete = getTaskById(id);
        taskRepository.delete(taskToDelete);
    }
}

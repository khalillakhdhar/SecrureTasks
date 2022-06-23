package com.doranco.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.security.dao.TaskRepository;
import com.doranco.security.model.Task;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	public Task addTask(Task task)
	{
		return taskRepository.save(task);
		
	}
	public List<Task> getTasks()
	{
		return taskRepository.findAll();
	}
	
	
	
}

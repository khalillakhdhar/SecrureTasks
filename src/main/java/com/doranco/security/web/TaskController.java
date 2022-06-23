package com.doranco.security.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.security.model.Task;
import com.doranco.security.service.TaskService;

@RestController
public class TaskController {
@Autowired
TaskService taskService;
@GetMapping("/task")
public List<Task> getAll()
{
	return taskService.getTasks();
}
@PostMapping("/task")
public Task addOne(@RequestBody @Valid Task task)
{
return taskService.addTask(task);	

}




}

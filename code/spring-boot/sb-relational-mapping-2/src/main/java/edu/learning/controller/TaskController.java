package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.entity.Task;
import edu.learning.repo.TaskRepo;

@RestController
public class TaskController {
	@Autowired
	TaskRepo repo;
	
	@PostMapping("/save-task")
	public String saveTask(@RequestBody Task task) {
		repo.save(task);
		return "Task Save Successfully...";
	}
	
	@GetMapping("/get-task")
	public List<Task> getAllTask() {
		return repo.findAll();
	}
}

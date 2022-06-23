package com.doranco.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doranco.security.model.Task;
import com.doranco.security.service.TaskService;

@SpringBootApplication
public class SecrureTasksApplication implements CommandLineRunner {

	@Autowired
	TaskService taskService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SecrureTasksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		taskService.addTask(new Task("tache1"));
		taskService.addTask(new Task("tache2"));
		// forEach() toute la fonction fléché doit être entre les () de la boucle forEach
		taskService.getTasks().forEach( t ->{
			// t = le task qui vient de taskService.getTasks() (déclaration et affectation)
			// aprés ->{ } on écrit ce qu'on veut faire
			System.out.println(t.toString());
		}
		);
		
	}

}

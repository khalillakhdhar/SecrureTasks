package com.doranco.security.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Task implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String taskName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + "]";
	}
	
	
	
	
	
}

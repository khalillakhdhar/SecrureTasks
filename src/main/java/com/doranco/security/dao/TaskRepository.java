package com.doranco.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.security.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

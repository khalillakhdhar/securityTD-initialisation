package com.orsys.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orsys.security.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

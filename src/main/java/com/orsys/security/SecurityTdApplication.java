package com.orsys.security;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.orsys.security.dao.TaskRepository;
import com.orsys.security.entities.Task;


@SpringBootApplication
public class SecurityTdApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(SecurityTdApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Stream.of("T1","T2","T3").forEach(t->{
			taskRepository.save(new Task(t));});
		taskRepository.findAll().forEach(t->{
			System.out.println(t.getTaskName()+" saved");
		});
			}
			
}
			


package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Worker;

public interface IWorkerDAO extends JpaRepository<Worker, Long> {

	/**
	 * Gets the workers of the same name
	 * 
	 * @param name
	 * @return
	 */
	public List<Worker> getWorkersByName(String name);
}
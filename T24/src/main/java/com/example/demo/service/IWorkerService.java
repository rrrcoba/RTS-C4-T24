package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Worker;

public interface IWorkerService {

	/**
	 * Returns all workers from the table
	 * 
	 * @return all workers
	 */
	public List<Worker> getAllWorkers();

	/**
	 * Saves the worker into the table
	 * 
	 * @param w
	 * @return worker saved
	 */
	public Worker saveWorker(Worker w);

	/**
	 * Returns the worker of the id given
	 * 
	 * @param id
	 * @return worker found
	 */
	public Worker getWorkerById(Long id);

	/**
	 * Returns a list of workers with the same name
	 * 
	 * @param name
	 * @return list of workers
	 */
	public List<Worker> getWorkersByName(String name);

	/**
	 * Updates the given worker
	 * 
	 * @param w
	 * @return worker updated
	 */
	public Worker updateWorker(Worker w);

	/**
	 * Deletes the worker of the given id
	 * 
	 * @param id
	 */
	public void deleteWorker(Long id);
}
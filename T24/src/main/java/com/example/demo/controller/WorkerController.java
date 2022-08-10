package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WorkerServiceImpl;
import com.example.demo.dto.Worker;

@RestController
@RequestMapping("/api")
public class WorkerController {

	@Autowired
	WorkerServiceImpl workerServiceImpl;

	@GetMapping("/workers")
	public List<Worker> listAllWorkers() {
		return workerServiceImpl.getAllWorkers();
	}

	@GetMapping("/workers/name/{name}")
	public List<Worker> listWorkersByName(@PathVariable(name = "name") String name) {
		return workerServiceImpl.getWorkersByName(name);
	}

	@PostMapping("/workers/saveWorker")
	public Worker saveWorker(@RequestBody Worker w) {
		Worker worker = new Worker(w.getName(), w.getWork());
		workerServiceImpl.saveWorker(worker);
		return worker;
	}

	@GetMapping("/workers/{id}")
	public Worker workerById(@PathVariable(name = "id") Long id) {
		Worker w = new Worker();
		w = workerServiceImpl.getWorkerById(id);
		System.out.println("Worker by ID: " + w);
		return w;
	}

	@PutMapping("/workers/{id}")
	public Worker updateWorker(@PathVariable(name = "id") Long id, @RequestBody Worker w) {
		Worker updatedWorker;
		Worker selectedWorker;

		selectedWorker = workerServiceImpl.getWorkerById(id);

		selectedWorker.setName(w.getName());
		selectedWorker.setWork(w.getWork());
		
		
		updatedWorker = workerServiceImpl.updateWorker(selectedWorker);

		System.out.println("Updated worker.");

		return updatedWorker;
	}

	@DeleteMapping("/workers/{id}")
	public void deleteWorker(@PathVariable(name = "id") Long id) {
		workerServiceImpl.deleteWorker(id);
		System.out.println("Worker with ID=[" + id + "] deleted.");
	}
}
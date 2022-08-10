package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IWorkerDAO;
import com.example.demo.dto.Worker;

@Service
public class WorkerServiceImpl implements IWorkerService {

	@Autowired
	IWorkerDAO iWorkerDAO;

	@Override
	public List<Worker> getAllWorkers() {

		return iWorkerDAO.findAll();
	}

	@Override
	public Worker saveWorker(Worker w) {

		return iWorkerDAO.save(w);
	}

	@Override
	public Worker getWorkerById(Long id) {

		return iWorkerDAO.findById(id).get();
	}

	@Override
	public List<Worker> getWorkersByName(String name) {

		return iWorkerDAO.getWorkersByName(name);
	}

	@Override
	public Worker updateWorker(Worker w) {

		return iWorkerDAO.save(w);
	}

	@Override
	public void deleteWorker(Long id) {

		iWorkerDAO.deleteById(id);
	}

}
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import javax.persistence.Enumerated;

@Entity
@Table(name = "workers")
public class Worker {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name="work")
	private ResourceType work;

	public enum ResourceType {developer, tester, analyst};

	@Column(name="salary")
	private Double salary;

	/**
	 * Default constructor
	 */
	public Worker() {
		this.name = "Default";
		this.work = ResourceType.developer;
		this.salary = 0.0;
	}

	/**
	 * Constructor using all fields
	 * 
	 * @param id
	 * @param name
	 * @param work
	 */
	public Worker(String name, ResourceType work) {
		this.name = name;
		this.setWork(work);
	}

	/**
	 * Assigns the salary for the work given
	 * 
	 * @param work
	 * @return
	 */
	private Double workSalaryAssign(ResourceType work) {
		Double salary = 0.0;
		if (work.compareTo(ResourceType.analyst) == 0) {
			salary = 30000.0;
		}
		if (work.compareTo(ResourceType.developer) == 0) {
			salary = 17500.0;
		}
		if (work.compareTo(ResourceType.tester) == 0) {
			salary = 25000.0;
		}
		return salary;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the work
	 */
	public ResourceType getWork() {
		return work;
	}

	/**
	 * @param work the work to set
	 */
	public void setWork(ResourceType work) {
		try {
			this.work = work;
			this.salary = workSalaryAssign(work);

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "ERROR: Worker type not correct. Exception: " + ex.getMessage(),
					"WORKER TYPE ERROR", 0);
		}
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
}
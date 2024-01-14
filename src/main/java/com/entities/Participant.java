package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Participant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
    private int totalPoints; // Store the participant's accumulated points
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participant(String name, int totalPoints) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", totalPoints=" + totalPoints + "]";
	}
    
    
    
}

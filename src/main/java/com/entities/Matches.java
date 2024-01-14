package com.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Matches {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String team1;
    private String team2;
    private LocalDateTime date;
    @Column(name = "team1_score")
    private int team1Score; // To store actual scores after the match
    @Column(name = "team2_score")
    private int team2Score; // To store actual scores after the match
	public Matches() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matches(String team1, String team2, LocalDateTime date) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public int getTeam1Score() {
		return team1Score;
	}
	public void setTeam1Score(int team1Score) {
		this.team1Score = team1Score;
	}
	public int getTeam2Score() {
		return team2Score;
	}
	public void setTeam2Score(int team2Score) {
		this.team2Score = team2Score;
	}
	@Override
	public String toString() {
		return "Matches [id=" + id + ", team1=" + team1 + ", team2=" + team2 + ", date=" + date + ", team1Score="
				+ team1Score + ", team2Score=" + team2Score + "]";
	}
    
    
}

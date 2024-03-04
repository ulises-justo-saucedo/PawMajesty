package com.PawMajesty.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "kitten")
public class Kitten {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "kitten_name")
	private String name;
	private String wealth;
	private String story;
	public Kitten() {
		
	}
	public Kitten(String name, String wealth, String story) {
		this.name = name;
		this.wealth = wealth;
		this.story = story;
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
	public String getWealth() {
		return wealth;
	}
	public void setWealth(String wealth) {
		this.wealth = wealth;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
}

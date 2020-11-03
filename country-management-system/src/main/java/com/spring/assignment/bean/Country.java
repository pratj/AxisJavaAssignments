package com.spring.assignment.bean;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer countryId;
	private String name;
	private String capital;
	private double population;
	private String language;
	
	public Country() {}
	public Country(Integer countryId, String name, String capital, double population, String language) {
		super();
		this.countryId = countryId;
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.language = language;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	

}

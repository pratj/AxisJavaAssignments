package com.spring.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assignment.bean.Country;
import com.spring.assignment.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	
	public Country addCountry(Country country) {
		return countryRepository.save(country);
		/*todos.add(toDo);
		return toDo;*/
	}
	
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	public Country getCountry(Integer id){
		return countryRepository.findById(id).orElse(null);
	}

}

package com.spring.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.spring.assignment.bean.Country;
import com.spring.assignment.service.CountryService;

@RestController
public class CountryController {
	@Autowired
	CountryService countryService;
	
	@GetMapping("/country")
	public List<Country> retrieveCountries(){			
		return countryService.getAllCountries();
	}
	
	@GetMapping("/country/{id}")
	public Country retrieveCountry(@PathVariable Integer id){			
		return countryService.getCountry(id);
	}
	
	@PostMapping("/country/add")
	public ResponseEntity<Country> addCountry(@RequestBody Country country) {
		Country country1 = countryService.addCountry(country);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Reponse-from", "ToDoController");
		//return ResponseEntity.accepted().headers(headers).body(todo);
		
		return new ResponseEntity<Country>(country1,headers,HttpStatus.OK);
	}
}



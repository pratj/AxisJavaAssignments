package com.spring.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.assignment.bean.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{
	

}

package com.esprit.microservices;


import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
	
	   
}
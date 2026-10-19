package com.vcube.crickbuzzservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.crickbuzzservice.model.CricketPlayer;

public interface CricketPlayerRepo extends JpaRepository<CricketPlayer,Integer>{
	
}
package com.vcube.crickbuzzservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.crickbuzzservice.model.CricketPlayer;
import com.vcube.crickbuzzservice.repo.CricketPlayerRepo;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/cricket")
public class CricketPlayerController {
	
	CricketPlayerRepo cricketPlayerRepo;
	
	 public CricketPlayerController(CricketPlayerRepo cricketPlayerRepo) {
	        this.cricketPlayerRepo = cricketPlayerRepo;
	    }

	
	@PostMapping("/create")
	CricketPlayer createPlayerInfo(@RequestBody CricketPlayer cp){
		return cricketPlayerRepo.save(cp);
		
	}
	
	@GetMapping("/getPlayers")
	List<CricketPlayer> getAllCricketPlayerInfo(){
		return cricketPlayerRepo.findAll();
	}
	
	@GetMapping("/getPlayers/{id}")
	CricketPlayer getAllCricketPlayerInfo(@PathVariable Integer id){
		return cricketPlayerRepo.findById(id) .orElseThrow(() ->
        new RuntimeException("Player not found: " + id));
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteCricketPlayerInfo(@PathVariable Integer id){
		 if (!cricketPlayerRepo.existsById(id)) {
	            throw new RuntimeException("Player not found: " + id);
	        }

	        cricketPlayerRepo.deleteById(id);
	        return "Player deleted successfully";
	}
	
	
	@PutMapping("/update/{id}")
	CricketPlayer updateCricketPlayerInfo(
			@RequestBody CricketPlayer c, 
			@PathVariable Integer id){
	  CricketPlayer cpfromdb = cricketPlayerRepo.findById(id).orElseThrow(() ->
      new RuntimeException("Player not found: " + id));

	  
	  cpfromdb.setPlayerName(c.getPlayerName());
      cpfromdb.setCountry(c.getCountry());
      cpfromdb.setRole(c.getRole());
      cpfromdb.setFormat(c.getFormat());
      cpfromdb.setMatchesPlayed(c.getMatchesPlayed());
      cpfromdb.setRunsScored(c.getRunsScored());
      cpfromdb.setHighestScore(c.getHighestScore());
      cpfromdb.setBattingAverage(c.getBattingAverage());
      cpfromdb.setStrikeRate(c.getStrikeRate());
      cpfromdb.setWicketsTaken(c.getWicketsTaken());
      cpfromdb.setEconomyRate(c.getEconomyRate());
      
      System.out.println("Updating player ID: " + id);
 
	  return cricketPlayerRepo.save(cpfromdb);
	}
	
	
	
	

}

package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.entity.MovieInfo;
import com.edu.service.MovieInfoService;

@RestController
@RequestMapping
public class MovieInfoController {
	
	@Autowired
	private MovieInfoService movieInfoService;
	
	@PostMapping("/movie-info/save")
	public List<MovieInfo> saveAllMovieInfoDetails(@RequestBody List<MovieInfo> movieInfo) {
		List<MovieInfo> movieinfo=movieInfoService.saveAllMovieInfoDetails(movieInfo);
		return movieinfo;
	}
	
	@GetMapping("/movie-info/list")
	public List<MovieInfo> getAllMovieInfoDetails(){
		List<MovieInfo> movieinfo=movieInfoService.getAllMovieInfoDetails();
		return movieinfo;
		
		
	}

}

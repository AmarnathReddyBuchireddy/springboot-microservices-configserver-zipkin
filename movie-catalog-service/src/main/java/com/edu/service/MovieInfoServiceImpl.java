package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.entity.MovieInfo;
import com.edu.repository.MovieInfoRepository;

@Service
public class MovieInfoServiceImpl implements MovieInfoService{
	
	@Autowired
	private MovieInfoRepository movieInfoRepository;

	@Override
	public List<MovieInfo> saveAllMovieInfoDetails(List<MovieInfo> movieInfo) {
		List<MovieInfo>  movieinfo=movieInfoRepository.saveAll(movieInfo);
		return movieinfo;
	}

	@Override
	public List<MovieInfo> getAllMovieInfoDetails() {
		List<MovieInfo> movieinfo = movieInfoRepository.findAll();
		return movieinfo;
	}
	
	

}

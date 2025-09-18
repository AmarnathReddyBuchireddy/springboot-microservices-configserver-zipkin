package com.edu.service;

import java.util.List;

import com.edu.entity.MovieInfo;

public interface MovieInfoService {

	List<MovieInfo> saveAllMovieInfoDetails(List<MovieInfo> movieInfo);

	List<MovieInfo> getAllMovieInfoDetails(); 

}

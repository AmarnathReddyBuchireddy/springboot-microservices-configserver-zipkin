package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.entity.MovieInfo;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long>{

}

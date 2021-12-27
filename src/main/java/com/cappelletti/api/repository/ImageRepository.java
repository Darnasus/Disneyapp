package com.cappelletti.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cappelletti.api.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, String>{
	
	

}

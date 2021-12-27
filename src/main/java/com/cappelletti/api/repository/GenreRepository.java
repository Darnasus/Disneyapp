package com.cappelletti.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cappelletti.api.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, String>{
	public Optional<Genre> findById(String id);
}

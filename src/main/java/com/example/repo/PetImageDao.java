package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.PetImage;

public interface PetImageDao extends JpaRepository<PetImage, Integer> {

	public List<PetImage> findAll();
	
}

package com.revature.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.PetImage;

public interface ImageRepository extends JpaRepository<PetImage, Integer>{
    
    public ArrayList<PetImage> findAll();

}

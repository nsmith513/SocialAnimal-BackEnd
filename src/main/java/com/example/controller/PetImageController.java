package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PetImage;
import com.example.repo.PetImageDao;

@RestController
@RequestMapping("/pet")
@CrossOrigin(origins="*")
public class PetImageController {
	
	private PetImageDao petImageDao;
	
	@Autowired
	public PetImageController(PetImageDao petImageDao) {
		super();
		this.petImageDao = petImageDao;
	}

	@GetMapping("/getAll")
	public List<PetImage> findAllImages(){
		return petImageDao.findAll();
	}

	@PostMapping("/post")
	public String addImage(@RequestBody PetImage img) {
		petImageDao.save(img);
		return "success";
	}
	
}

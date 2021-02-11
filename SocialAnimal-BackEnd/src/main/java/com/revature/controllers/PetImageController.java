package com.revature.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.PetImage;
import com.revature.repositories.ImageRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/pets")
public class PetImageController {
    
    @Autowired
    private ImageRepository imgDAO;
    
    @GetMapping("/getall")
    @ResponseBody
    public ResponseEntity<ArrayList<PetImage>> getAllPets() {
    	ArrayList<PetImage> images = imgDAO.findAll();
        if (images != null) {
            return ResponseEntity.ok(images);
        }
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping("/submit")
    @ResponseBody
    public ResponseEntity<PetImage> submitImage(@RequestBody PetImage img) {
        PetImage image = imgDAO.save(img);
        if (image != null) {
            return ResponseEntity.ok(image);
        }
        return ResponseEntity.notFound().build();
    }

}

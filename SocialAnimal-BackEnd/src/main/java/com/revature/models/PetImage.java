package com.revature.models;

<<<<<<< HEAD
import java.io.Serializable;

=======
import javax.persistence.Column;
>>>>>>> b8466f89afd7bd800f8081ccc0566c80c595b145
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PetImage implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Integer pet_id;
    
    private byte[] petImage;
=======
    private int id;
>>>>>>> b8466f89afd7bd800f8081ccc0566c80c595b145
    
    @Column(name="link", unique=true, nullable=false)
    private String link;

	public PetImage() {}

	public PetImage(String link) {
		super();
		this.link = link;
	}

	public PetImage(int id, String link) {
		super();
		this.id = id;
		this.link = link;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetImage other = (PetImage) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PetImage [id=" + id + ", link=" + link + "]";
	}
    
}

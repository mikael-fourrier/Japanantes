package com.japanantes.app;

import java.util.*;

public abstract class Lieu {
	
    private String nom,
                   description;
    
    private List<Shape2d> emplacement;
    
    public Lieu(String nom, String desc){
    	this.emplacement = new ArrayList<Shape2d>();
    }
    
	public String getNom() { return nom; }
	public void setNom(String nom) { this.nom = nom; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public List<Shape2d> getEmplacement() {	return emplacement; }

	
}

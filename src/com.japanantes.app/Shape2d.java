package com.japanantes.app;

import java.util.*;

public class Shape2d {
	
    private List<Point> points;
    private Etage etage;
    
    public Shape2d(Etage etage){
    	this.etage=etage;
    	this.points=new ArrayList<Point>();
    }
    
	public Etage getEtage() { return etage; }
	public void setEtage(Etage etage) {	this.etage = etage;	}

	public List<Point> getPoints() { return points; }

}

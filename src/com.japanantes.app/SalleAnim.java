package com.japanantes.app;

import java.util.*;

public class SalleAnim extends Lieu {
	
    private List<Animation> animations;
    
    public SalleAnim(String nom, String description){
    	super(nom, description);
    	this.animations= new ArrayList<Animation>();
    }

	public List<Animation> getAnimations() { return animations; }
	
	
}
